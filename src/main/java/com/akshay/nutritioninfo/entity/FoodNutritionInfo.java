package com.akshay.nutritioninfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodNutritionInfo {
	
	private String food_details;
	private double serving_weight_grams;
	private double nf_calories;
	private double nf_protein;
	private double nf_total_fat;
	private double nf_total_carbohydrate;
	
	
	public String getFood_details() {
		return food_details;
	}
	public void setFood_details(String food_details) {
		this.food_details = food_details;
	}
	public double getServing_weight_grams() {
		return serving_weight_grams;
	}
	public void setServing_weight_grams(double serving_weight_grams) {
		this.serving_weight_grams = serving_weight_grams;
	}
	public double getNf_calories() {
		return nf_calories;
	}
	public void setNf_calories(double nf_calories) {
		this.nf_calories = nf_calories;
	}
	public double getNf_protein() {
		return nf_protein;
	}
	public void setNf_protein(double nf_protein) {
		this.nf_protein = nf_protein;
	}
	public double getNf_total_fat() {
		return nf_total_fat;
	}
	public void setNf_total_fat(double nf_total_fat) {
		this.nf_total_fat = nf_total_fat;
	}
	public double getNf_total_carbohydrate() {
		return nf_total_carbohydrate;
	}
	public void setNf_total_carbohydrate(double nf_total_carbohydrate) {
		this.nf_total_carbohydrate = nf_total_carbohydrate;
	}
}
