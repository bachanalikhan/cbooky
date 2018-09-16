package com.cbooky.invoice.db;

import org.springframework.data.repository.CrudRepository;

import com.cbooky.invoice.model.Item;
import com.cbooky.invoice.model.ItemPk;

public interface InvoiceItemsRepository extends CrudRepository<Item, ItemPk> {

}
