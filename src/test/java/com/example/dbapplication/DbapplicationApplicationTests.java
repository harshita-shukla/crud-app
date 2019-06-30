package com.example.dbapplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
//@SpringBootTest
public class DbapplicationApplicationTests {


	
	@Mock
	CRUDInteraceImplDev crudService;
	
	
	@InjectMocks
CalcService service;




	
	@Test
	public void testFilter() {
	
		//crudService = Mockito.mock(CRUDInteraceImplDev.class);
		Mockito.when(crudService.createEmployee(Mockito.any(Employee.class))).thenReturn(new Employee("dada",44));
		List<String> list = new ArrayList<String>();
		list.add("fafa");list.add("dabur");
		List<String> words = service.doFilter(list);
		assertNotNull(words);
		assertEquals("dabur", words.get(0));
		assertEquals("dada", words.get(1));

	}

}
