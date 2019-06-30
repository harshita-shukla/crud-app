package com.example.dbapplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//@Profile("test")
@Service
public class CRUDInteraceImplDev implements CRUDInterfae{

	
	@PersistenceContext
	 EntityManager em;
	
	@Autowired
	EmployeeRepository repo;
	
	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		//em.getTransaction().begin();
		//create : em.persist(employee);
		em.persist(employee);
		//empl.setName("dfdf");
		return em.merge(employee);
		//System.out.println(empl.toString());
		
		//System.out.println(repo.findById(1));
		
		
		
		
		//em.getTransaction().commit();
		
	}
}
