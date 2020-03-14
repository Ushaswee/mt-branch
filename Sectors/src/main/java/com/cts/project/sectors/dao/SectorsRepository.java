package com.cts.project.sectors.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.sectors.pojo.Sectors;

public interface SectorsRepository extends CrudRepository<Sectors,Integer> {
	Iterable<Sectors> findAll();

}
