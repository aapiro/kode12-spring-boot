package com.kode12.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class TestController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/doTest")
	@HystrixCommand(fallbackMethod = "getDataFallBack", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000") })
	public List<String> doTest() {
		return restTemplate.getForObject("http://localhost:8080/getData", List.class);
	}

	@RequestMapping(value = "/getData")
	public List<String> getData() {
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		List<String> list = new ArrayList<String>();
		list.add("Live 1");
		list.add("Live 2");
		list.add("Live 3");
		return list;
	}

	public List<String> getDataFallBack() {
		List<String> list = new ArrayList<String>();
		list.add("FallBack 1");
		list.add("FallBack 2");
		list.add("FallBack 3");
		return list;
	}

}
