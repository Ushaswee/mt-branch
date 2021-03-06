package com.cts.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.IPOsRepository;
import com.cts.project.dao.SectorsRepository;
import com.cts.project.pojo.IPOs;
import com.cts.project.pojo.Sectors;
@CrossOrigin(origins="http://localhost:4200")
	@RestController

	@RequestMapping("/Sectors")

	public class SectorsController {

		@Autowired

		private SectorsRepository sectorsRepository;
		@RequestMapping("/getAllSectors")

		public Iterable<Sectors> getAllSectors() {

			return (Iterable<Sectors>) sectorsRepository.findAll();

		}

		@PostMapping("/saveSectors")

		public Sectors saveSectors(@RequestBody Sectors sectors) {

			System.out.println(sectors);

			sectorsRepository.save(sectors);

			return sectors;

		}

		@PutMapping("/updateSectors/{sectorid}")

		public Sectors updateSectors(@RequestBody Sectors sectors, @PathVariable("sectorid") Integer sectorid) {

			sectors.setSectorid(sectorid);

			System.out.println(sectors);

			sectorsRepository.save(sectors);

 			return sectors;

		}

		@DeleteMapping("/deleteSectors/{sectorid}")

		public Boolean deleteSectors(@PathVariable("sectorid") Integer sectorid) {

			System.out.println(sectorid);

			sectorsRepository.deleteById(sectorid);

			return true;

		}

		@GetMapping("/findOneInAll3/{sectorid}")

		public Sectors findoneinall(@PathVariable("sectorid") Integer sectorid) {

			Optional<Sectors> sectors = sectorsRepository.findById(sectorid);

			return sectors.get();

		}

	}
