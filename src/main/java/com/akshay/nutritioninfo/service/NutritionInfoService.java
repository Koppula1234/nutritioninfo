package com.akshay.nutritioninfo.service;

import com.akshay.nutritioninfo.entity.Nutrition;

public interface NutritionInfoService {

	Nutrition getNutritionInfoByFoodName(String foodName, String xUserJwt, String xAppId, String xAppKey);
}
