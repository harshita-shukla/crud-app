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
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import junit.framework.Assert;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.BDDMockito.given;


@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
//@SpringBootTest
public class ControllerTest {


	
	@MockBean
	CRUDInterfae crudService;
	
	 @Autowired
	    private MockMvc mvc;	
	//@InjectMocks
//CalcService service;




	
	@Test
	public void testFilter() throws Exception {
	
		//crudService = Mockito.mock(CRUDInteraceImplDev.class);
		given(crudService.createEmployee(Mockito.any(Employee.class))).willReturn(new Employee("dada",44));
		mvc.perform(get("/api/employee")).andExpect(status().isOk());

	}

}
