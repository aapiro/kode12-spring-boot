package com.kode12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kode12.vo.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAopBasicApplicationTests {

	@Autowired
	Employee employee;

	@Test
	public void contextLoads() {
		employee.setId(1);
		employee.setName("Yogesh P");
	}

}
