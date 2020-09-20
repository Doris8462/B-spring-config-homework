package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@TestPropertySource(properties = {"levelNumber=0"})
class DemoSpringConfigApplicationTests {
	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		assertEquals("basic",levelController.getLevel());
	}
}
@SpringBootTest
@TestPropertySource(properties = {"levelNumber=1"})
class DemoSpringConfigApplicationTests1 {
	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		assertEquals("advanced",levelController.getLevel());
	}
}
@SpringBootTest
@TestPropertySource(properties = {"levelNumber=2"})
class DemoSpringConfigApplicationTests2 {
	@Autowired
	private LevelController levelController;

	@Test
	void contextLoads() {
		assertEquals("advanced",levelController.getLevel());
	}
}
