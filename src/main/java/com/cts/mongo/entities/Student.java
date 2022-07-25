package com.cts.mongo.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

//To map a Collection with Entity Class
//Document is a row 
//All Documents are stored in a Collection
@Document(collection = "student")
@Getter
@Setter
public class Student {

	@Id
	private String id;

	// Don't need to provide to @Field to the class fields which are having same
	// name in the collection's field
	private String name;

	@Field(name = "mail")
	private String email;

	private Department department;

	private List<Subject> subjects;

	// If we have more than one Constructor in a java entity class then we need to
	// define one constructor with @PersistenceConstructor 
}
