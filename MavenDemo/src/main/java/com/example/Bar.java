package com.example;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="bar")
public class Bar implements Serializable{
	
	@Id
	@GenericGenerator (name="krupa", strategy="increment")
	@GeneratedValue(generator="krupa")
	private int bar_lid;
	
	private String bar_name;
	
	private String drink;
	
	private Double price;

	@Override
	public String toString() {
		return "Bar [bar_lid=" + bar_lid + ", bar_name=" + bar_name + ", drink=" + drink + ", price=" + price + "]";
	}

	
	public int getBar_lid() {
		return bar_lid;
	}

	public void setBar_lid(int bar_lid) {
		this.bar_lid = bar_lid;
	}

	public String getBar_name() {
		return bar_name;
	}

	public void setBar_name(String bar_name) {
		this.bar_name = bar_name;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
