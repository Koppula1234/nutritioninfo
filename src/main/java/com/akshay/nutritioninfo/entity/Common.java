package com.akshay.nutritioninfo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Common {

	@JsonProperty("food_name")
	private String foodName;
	
	@JsonProperty("serving_unit")
	private String servingUnit;
	
	@JsonProperty("tag_name")
	private String tagName;
	
	@JsonProperty("servingQty")
	private String serving_qty;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getServingUnit() {
		return servingUnit;
	}

	public void setServingUnit(String servingUnit) {
		this.servingUnit = servingUnit;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getServing_qty() {
		return serving_qty;
	}

	public void setServing_qty(String serving_qty) {
		this.serving_qty = serving_qty;
	}
}
