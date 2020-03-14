package com.cts.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.pojo.IPOs;

public interface IPOsRepository extends CrudRepository<IPOs,Integer> {
Iterable<IPOs> findAll();
}
