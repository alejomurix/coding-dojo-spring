package com.codingdojo.travel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="expenses")
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="El campo no debe ser vacio.")
	@NotEmpty
	private String name;
	
	@NotNull(message="El campo no debe ser vacio.")
	@NotEmpty
	private String vendor;
	
	@NotNull(message="El campo no debe ser vacio.")
	//@Size(min=1, message="El valor debe ser mayor a cero.")
	private double amount;
	
	@NotNull(message="El campo no debe ser vacio.")
	@NotEmpty
	private String description;
	
	public Expense() {}

	
	public Expense(Long id, String name, String vendor, double amount, String description) {
		this.id = id;
		this.name = name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}
	
	public Expense(String name, String vendor, double amount, String description) {
		this.name = name;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
