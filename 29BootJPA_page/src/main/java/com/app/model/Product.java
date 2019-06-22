package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="pp")
public class Product {
	@Id
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
}