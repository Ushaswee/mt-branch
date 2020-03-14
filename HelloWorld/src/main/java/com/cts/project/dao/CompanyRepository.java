package com.cts.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.pojo.Company;
import com.cts.project.pojo.Sectors;


public interface CompanyRepository extends CrudRepository<Company,String>{
	Iterable<Company> findAll();
}
