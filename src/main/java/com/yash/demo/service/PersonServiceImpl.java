package com.yash.demo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.yash.demo.Dao.PersonRepository;
import com.yash.demo.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{


	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository=personRepository;
	}
	@Override
	public List<Person> findAllPerson() {
		List<Person> persons=personRepository.findAll();
		for(Person data:persons) {
			System.out.println(data + " "+System.currentTimeMillis());
		}
		return persons;
	}
	
	
	/*
	 * @Override public List<Person> findAllPerson() { Connection
	 * con=personRepository.getConnection(); String sql="Select * from person"; try
	 * { Statement st=con.createStatement(); System.out.println(st.execute(sql)); }
	 * catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * return null; }
	 */
	
	

}
