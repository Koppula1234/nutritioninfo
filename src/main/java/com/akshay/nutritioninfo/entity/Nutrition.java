package com.akshay.nutritioninfo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Nutrition {

	private List<FoodNutritionInfo> foods;

	public List<FoodNutritionInfo> getFoods() {
		return foods;
	}

	public void setFoods(List<FoodNutritionInfo> foods) {
		this.foods = foods;
	}
}
