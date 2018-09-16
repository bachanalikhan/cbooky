/**
 * 
 */
package com.cbooky.invoice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author BA Khan
 *
 */
@Entity
public class Invoice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4471265092322598061L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer invoiceNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date invoicedate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date duedate;
	private String custGSTNumber;
	private String custId;
	private String note;
	@ManyToOne
	@JoinColumn(name = "email")
	private User lastEditor;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastEdited;

	public Invoice() {

	}

	public Invoice(Integer invoiceNumber, Date invoicedate, Date duedate, String custGSTNumber, String custId,
			String note, User lastEditor, Date lastEdited) {
		this.invoiceNumber = invoiceNumber;
		this.invoicedate = invoicedate;
		this.duedate = duedate;
		this.custGSTNumber = custGSTNumber;
		this.custId = custId;
		this.note = note;
		this.lastEditor = lastEditor;
		this.lastEdited = lastEdited;
	}

	public Integer getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getInvoicedate() {
		return invoicedate;
	}

	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public String getCustGSTNumber() {
		return custGSTNumber;
	}

	public void setCustGSTNumber(String custGSTNumber) {
		this.custGSTNumber = custGSTNumber;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getLastEditor() {
		return lastEditor;
	}

	public void setLastEditor(User lastEditor) {
		this.lastEditor = lastEditor;
	}

	public Date getLastEdited() {
		return lastEdited;
	}

	public void setLastEdited(Date lastEdited) {
		this.lastEdited = lastEdited;
	}

}
