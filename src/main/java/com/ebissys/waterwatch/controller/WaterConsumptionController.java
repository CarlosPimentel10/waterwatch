package com.ebissys.waterwatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebissys.waterwatch.model.WaterConsumption;
import com.ebissys.waterwatch.repository.WaterConsumptionRepository;
import com.ebissys.waterwatch.service.WaterConsumptionService;

@RestController 
@RequestMapping("/waterconsumption")
public class WaterConsumptionController {
	
	@Autowired
	private WaterConsumptionService waterConsumptionService;
	
	
	@GetMapping
	public List<WaterConsumption> findAll(){
		return waterConsumptionService.findAll();
	}
	
	@GetMapping("/topten")
	public List<WaterConsumption> findTopTenConsumers(){
		return waterConsumptionService.findTopTenConsumers();
	}
	
	
	
	
}
