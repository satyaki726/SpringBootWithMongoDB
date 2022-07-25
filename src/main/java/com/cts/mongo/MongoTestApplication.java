package com.cts.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories("com.cts.mongo.repository")
public class MongoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoTestApplication.class, args);
	}

}
