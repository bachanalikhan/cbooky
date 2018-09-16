package com.cbooky.invoice.db;

import org.springframework.data.repository.CrudRepository;

import com.cbooky.invoice.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

}
