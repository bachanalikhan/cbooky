package com.cbooky.invoice.model;

import java.io.Serializable;
import java.util.List;

public class Items implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5276297699709908016L;
	private List<Item> items;

	public Items() {
	}

	public Items(List<Item> items) {
		super();
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
