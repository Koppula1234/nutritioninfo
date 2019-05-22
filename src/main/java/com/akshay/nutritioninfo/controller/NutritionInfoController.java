package com.akshay.nutritioninfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.nutritioninfo.entity.FoodType;
import com.akshay.nutritioninfo.entity.Nutrition;
import com.akshay.nutritioninfo.service.NutritionInfoService;

@RestController
@RequestMapping(value = "nutrition-info")
public class NutritionInfoController {
	
	@Autowired
	private NutritionInfoService nutritionInfoService;

    @RequestMapping(method = RequestMethod.GET)
    public Nutrition getNutritionInfoByFoodName(@RequestParam("name") String foodName, @RequestHeader(value="x-user-jwt") String xUserJwt, @RequestHeader(value="x-app-id") String xAppId, @RequestHeader(value="x-app-key") String xAppKey) {
        return nutritionInfoService.getNutritionInfoByFoodName(foodName, xUserJwt, xAppId, xAppKey);
    }
}
