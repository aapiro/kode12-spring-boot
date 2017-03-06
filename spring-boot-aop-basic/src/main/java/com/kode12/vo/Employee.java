package com.kode12.vo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Serializable {

	private static final long serialVersionUID = -4795125210761524259L;

	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
