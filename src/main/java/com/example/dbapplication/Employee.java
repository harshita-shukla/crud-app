package com.example.dbapplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Employee implements Comparable<Employee>{

	@Column
	String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="my_seq_gen")
	
	Integer id;
	
	@Column
	Integer age;
	

	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return o.age.compareTo(this.age);
	}
	
	
}
