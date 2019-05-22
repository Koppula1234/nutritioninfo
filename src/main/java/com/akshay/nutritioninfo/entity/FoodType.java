package com.akshay.nutritioninfo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodType {

	private List<Common> common;

	public List<Common> getCommon() {
		return common;
	}

	public void setCommon(List<Common> common) {
		this.common = common;
	}
}
