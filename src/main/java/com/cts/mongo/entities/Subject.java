package com.cts.mongo.entities;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subject {

	@Field(name = "subject_name")
	private String subjectName;
	
	@Field(name = "marks_obtained")
	private int marksObtained;
}
