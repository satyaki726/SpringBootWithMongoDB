package com.cts.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cts.mongo.entities.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
