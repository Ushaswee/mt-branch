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


import com.cts.project.dao.StockExchangeRepository;

import com.cts.project.pojo.StockExchange;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/StockExchange")
public class StockExchangeController {

	@Autowired

	private StockExchangeRepository stockexchangeRepository;

	@RequestMapping("/getAllStockExchange")

	public Iterable<StockExchange> getAllStockExchange() {

		return stockexchangeRepository.findAll();

	}

	@PostMapping("/saveStockExchange")

	public StockExchange saveStockExchange(@RequestBody StockExchange stockexchange) {

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}
	
	@PutMapping("/updateStockExchange/{stockid}")

	public StockExchange updateStockExchange(@RequestBody StockExchange stockexchange,

			@PathVariable("stockid") Integer stockid) {

		stockexchange.setStockid(stockid);

		System.out.println(stockexchange);

		stockexchangeRepository.save(stockexchange);

		return stockexchange;

	}

	@DeleteMapping("/deleteStockExchange/{stockid}")

	public Boolean deleteStockExchange(@PathVariable("stockid") Integer stockid) {

		System.out.println(stockid);

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(stockid);

		stockexchangeRepository.delete(stockexchange.get());

		return true;

	}

	@GetMapping("/findOneInAll4/{stockid}")

	public StockExchange findOneInAll4(@PathVariable("stockid") Integer stockid) {

		Optional<StockExchange> stockexchange = stockexchangeRepository.findById(stockid);

		return stockexchange.get();

	}

}
