package com.patronesMicroserv.loadBalancing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@ContextConfiguration(classes = testConfig.class)
class LoadBalancingApplicationTests {

	@Test
	void contextLoads() {
	}

}
