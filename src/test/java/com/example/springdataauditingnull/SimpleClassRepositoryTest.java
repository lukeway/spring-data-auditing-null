package com.example.springdataauditingnull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

@DataMongoTest
class SimpleClassRepositoryTest {
	@Autowired
	private SimpleClass1Repository simpleClass1Repository;
	
	@Autowired
	private SimpleClass2Repository simpleClass2Repository;

	@Test
	void testWithOneNestedLevelWorks() {
		simpleClass2Repository.save(new Class2());
	}
	
	@Test
	void testWithTwoNestedLevelsFails() {
		simpleClass1Repository.save(new Class1());
	}
}
