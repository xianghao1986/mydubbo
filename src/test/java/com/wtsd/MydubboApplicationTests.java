package com.wtsd;

import com.wtsd.dubbo.ServiceTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MydubboApplicationTests {

	private
	@Autowired
	ServiceTest serviceTest;
	@Test
	public void contextLoads() {
		System.err.println(serviceTest.test("nihao"));
	}

}
