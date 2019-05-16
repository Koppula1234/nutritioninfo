package com.akshay.nutritioninfo.service;

import org.springframework.stereotype.Service;

@Service
public class NutritionInfoServiceImpl implements NutritionInfoService{

	@Override
	public String getNutritionInfoByFoodName(String foodName) {
		return "NutritionInfo details for " + foodName;
	}

	
}
