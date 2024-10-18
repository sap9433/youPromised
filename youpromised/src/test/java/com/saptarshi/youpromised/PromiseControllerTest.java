package com.saptarshi.youpromised;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;


import java.util.Map;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PromiseControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testPromiseEndpointReturnsMap() {
		@SuppressWarnings("unchecked")
		Map<Object, Object> result = this.restTemplate.getForObject("http://localhost:8080"  + "/settings", Map.class);
		assertThat(result).isNotNull();
		// Add more assertions to check the content of the returned map
	}
}