package com.ebissys.waterwatch.repository;

import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ebissys.waterwatch.model.WaterConsumption;



@Repository
public interface WaterConsumptionRepository  extends JpaRepository<WaterConsumption, UUID>{
	
	@Query(value = "SELECT * FROM water_consumption " + 
	" ORDER BY avg_monthlykl DESC "
			+ " LIMIT 10", nativeQuery = true)
	List<WaterConsumption> findTopTenConsumers();
	
}
