package com.akshay.nutritioninfo.service;

import com.akshay.nutritioninfo.entity.Value;

public interface NutritionInfoService {

	Value getNutritionInfoByFoodName(String foodName);
}
