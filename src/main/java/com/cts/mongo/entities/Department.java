package com.cts.mongo.entities;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

//Don't need to provide @Document to the pojo's which are not directly connected with the db collection or not a separate Collection
@Getter
@Setter
public class Department {

	@Field(name = "department_name")
	private String departmentName;

	private String location;
}
