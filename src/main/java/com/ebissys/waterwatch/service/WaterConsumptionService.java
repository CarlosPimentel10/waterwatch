package com.ebissys.waterwatch.service;

import com.ebissys.waterwatch.model.WaterConsumption;
import java.util.List;




public interface WaterConsumptionService {
		List<WaterConsumption> findAll();
		List<WaterConsumption> findTopTenConsumers();
}
