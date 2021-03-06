package com.nt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Employee {

	@Id
	private String id;
	private String name;
	private String addrs;
	private double amt;
}
