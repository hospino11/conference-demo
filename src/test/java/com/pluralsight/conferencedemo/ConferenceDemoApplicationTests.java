package com.pluralsight.conferencedemo;

import com.pluralsight.conferencedemo.config.PersistenceConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.sql.DataSource;

@SpringBootTest(properties = "spring.flyway.enabled=false")
class ConferenceDemoApplicationTests {

	@MockBean
	private DataSource dataSource;

	@MockBean
	private PersistenceConfiguration persistenceConfiguration;

	@Test
	void contextLoads() {
	}

}
