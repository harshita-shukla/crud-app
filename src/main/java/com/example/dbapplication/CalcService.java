package com.example.dbapplication;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

@Autowired
CRUDInteraceImplDev servicecrud;	

	
	public List<String> doFilter(List<String> words) {
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		Employee emp = servicecrud.createEmployee(new Employee("dada",33));
		System.out.println(emp.toString());
		words.add(emp.name);
		return returnvalue(words);
	}

private List<String> returnvalue(List<String> words) {
	return words.stream().filter(p -> !p.contains("f")).collect(Collectors.toList());
}
}
