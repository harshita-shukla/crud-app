package com.example.dbapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private CRUDInterfae service;

	
	@Value("${publisher.name}")
	String name;

	@GetMapping("/employee")
	public Employee create() throws Exception {
		Employee e = new Employee("babu", 4);
		Employee e2 = new Employee("ajay", 2);
		Employee e3 = new Employee("dudu", 5);

		List<Employee> list = new ArrayList();
		list.add(e);list.add(e2);list.add(e3);
		
		
		
		//List<Employee> temp = filterBelow3YearsOFAge(list);
		
		Collections.sort(list);
		Comparator<Employee> comparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		/*
		 * Arrays.sort((Employee[])list.toArray(), comparator); list.sort(comparator);
		 * 
		 * logger.info(list.toString());
		 * 
		 * logger.info(name+ " "+e.toString());
		 */
		return service.createEmployee(e);
		// worker.printmessage();
	}

	private List<Employee> filterBelow3YearsOFAge(List<Employee> list) throws Exception {

		/*
		 * for(Employee e : list) { if(e.age<3) }
		 */		
		list=null;
		list=Optional.of(list).orElseThrow(() -> new Exception("something weird happened"));
		list.stream().filter(emp -> emp.age<3).map(emp -> emp.age+=2 ).collect(Collectors.toList());
		return null;
	}
	
	

}
