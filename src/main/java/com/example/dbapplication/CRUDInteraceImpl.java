package com.example.dbapplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Profile("local")

@Service
public class CRUDInteraceImpl implements CRUDInterfae{

	
	@PersistenceContext
	 EntityManager em;
	
	@Autowired
	EmployeeRepository repo;
	
	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		//em.getTransaction().begin();
		//create : em.persist(employee);
		Employee empl = em.find(Employee.class, 1);
		empl.setName("dfdf");
		return em.merge(empl);
		//System.out.println(empl.toString());
		
		//System.out.println(repo.findById(1));
		
		
		
		
		//em.getTransaction().commit();
		
	}
}
