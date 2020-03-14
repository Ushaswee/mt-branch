package com.cts.project.ipos.controller;
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

import com.cts.project.ipos.dao.IPOsRepository;
import com.cts.project.ipos.pojo.IPOs;
@CrossOrigin(origins="*")
	@RestController

	@RequestMapping("/Ipos")


	public class IPOsController {

		@Autowired

		private IPOsRepository iposRepository;

		@RequestMapping("/getAllIpos")

		public Iterable<IPOs> getAllIpos() {

			return (Iterable<IPOs>) iposRepository.findAll();

		}

		@PostMapping("/saveIpos")

		public IPOs saveIpos(@RequestBody IPOs ipos) {

			System.out.println(ipos);

			iposRepository.save(ipos);

			return ipos;

		}

		@PutMapping("/updateIpos/{ipoid}")

		public IPOs updateIpos(@RequestBody IPOs ipos, @PathVariable("ipoid") Integer ipoid) {

			ipos.setIpoid(ipoid);

			System.out.println(ipos);

			iposRepository.save(ipos);

 			return ipos;

		}

		@DeleteMapping("/deleteIpos/{ipoid}")

		public Boolean deleteIpos(@PathVariable("ipoid") Integer ipoid) {

			System.out.println(ipoid);

			iposRepository.deleteById(ipoid);

			return true;

		}

		@GetMapping("/findOneInAll2/{ipoid}")

		public IPOs findOneInAll2(@PathVariable("ipoid") Integer ipoid) {

			Optional<IPOs> ipos = iposRepository.findById(ipoid);

			return ipos.get();

		}

	}

