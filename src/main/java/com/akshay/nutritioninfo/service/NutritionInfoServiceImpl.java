package com.akshay.nutritioninfo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.akshay.nutritioninfo.entity.Quote;
import com.akshay.nutritioninfo.entity.Value;

@Service
public class NutritionInfoServiceImpl implements NutritionInfoService{

	@Override
	public Value getNutritionInfoByFoodName(String foodName) {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		return quote.getValue();
	}	
}
