/**
 * 
 */
package com.cbooky.invoice.controler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbooky.invoice.db.InvoiceItemsRepository;
import com.cbooky.invoice.db.InvoiceRepository;
import com.cbooky.invoice.db.UserRepository;
import com.cbooky.invoice.model.Invoice;
import com.cbooky.invoice.model.Item;
import com.cbooky.invoice.model.Items;
import com.cbooky.invoice.model.User;

/**
 *
 */
@RestController
@RequestMapping(path = "/invoice")
public class InvoiceControler {
	@Autowired
	private InvoiceRepository invoiceRepository;
	@Autowired
	private InvoiceItemsRepository invoiceItemsRepository;
	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "/add")
	public @ResponseBody String invoice(@RequestParam Invoice invoice) {
		invoiceRepository.save(invoice);
		return "Saved";
	}

	@PostMapping(path = "/adduser")
	public String addUser(@RequestBody User user) {
		User save = userRepository.save(user);
		return save.getEmail();
	}

	@PostMapping(path = "/add")
	public @ResponseBody Invoice putInvoice(@RequestBody Invoice invoice) {
		return invoiceRepository.save(invoice);
	}

	@GetMapping(path = "/delete")
	public @ResponseBody String deleteInvoiceRecord(@RequestParam Integer id) {
		invoiceRepository.deleteById(id);
		return "Deleted";
	}

	@GetMapping(path = "/get")
	public @ResponseBody Optional<Invoice> getInvoiceRecord(@RequestParam Integer id) {
		Optional<Invoice> findById = invoiceRepository.findById(id);
		return findById;
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Invoice> getAllInvoice() {
		return invoiceRepository.findAll();
	}

	@PostMapping(path = "/additems")
	public @ResponseBody Iterable<Item> postInvoiceItems(@RequestBody Items items) {
		Iterable<Item> saveAll = invoiceItemsRepository.saveAll(items.getItems());
		return saveAll;
	}

	@GetMapping(path = "/getallitems")
	public @ResponseBody Iterable<Item> getAllInvoiceItems() {
		return invoiceItemsRepository.findAll();
	}

	@PostMapping(path = "/deleteitems")
	public @ResponseBody String deleteItems(@RequestBody Item item) {
		invoiceItemsRepository.deleteById(item.getItemPk());
		return "deleted";
	}
}
