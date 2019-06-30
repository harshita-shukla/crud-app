package com.example.dbapplication;

import org.springframework.stereotype.Component;

@Component
public class Jobworker2 {

	private String message;



	public Jobworker2() {
		super();
	}

	public Jobworker2(String message) {
		System.out.println("constructing jobworker using argument constructor");

		this.message = message;
	}

	public void printmessage() {
		System.out.println("my message " + message);

	}

}
