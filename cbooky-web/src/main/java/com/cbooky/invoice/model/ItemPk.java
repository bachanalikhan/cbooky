package com.cbooky.invoice.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemPk implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1349260678116309807L;
	@ManyToOne
	@JoinColumn(name = "invoiceNumber")
	private Invoice invoice;
	private String pid;

	public ItemPk() {
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((invoice == null) ? 0 : invoice.getInvoiceNumber().hashCode());
		result = prime * result + ((pid == null) ? 0 : pid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPk other = (ItemPk) obj;
		if (invoice == null) {
			if (other.invoice != null)
				return false;
		} else if (!invoice.getInvoiceNumber().equals(other.getInvoice().getInvoiceNumber()))
			return false;
		if (pid == null) {
			if (other.pid != null)
				return false;
		} else if (!pid.equals(other.pid))
			return false;
		return true;
	}

}