package com.cts.project.ipos.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.ipos.pojo.IPOs;

public interface IPOsRepository extends CrudRepository<IPOs,Integer> {
Iterable<IPOs> findAll();
}
