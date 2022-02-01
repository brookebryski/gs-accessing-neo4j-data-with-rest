package com.example.gsaccessingneo4jdatawithrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://spring.io/guides/gs/accessing-neo4j-data-rest/

@SpringBootApplication
public class GsAccessingNeo4jDataWithRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsAccessingNeo4jDataWithRestApplication.class, args);
	}

}
// http://localhost:8080
// http://localhost:8080/people
// http://localhost:8080/people/0
// http://localhost:8080/people/search
// http://localhost:8080/people/search/findByLastName?name=Baggins
