package com.example.dbapplication;

import org.springframework.stereotype.Component;

@Component
public class Jobworker {

	private String message;



	public Jobworker() {
		super();
	}

	public Jobworker(String message) {
		System.out.println("constructing jobworker using argument constructor");

		this.message = message;
	}

	public void printmessage() {
		System.out.println("my message " + message);

	}

}
