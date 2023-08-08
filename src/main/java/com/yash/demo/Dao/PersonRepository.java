package com.yash.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.demo.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer>{
	

}
