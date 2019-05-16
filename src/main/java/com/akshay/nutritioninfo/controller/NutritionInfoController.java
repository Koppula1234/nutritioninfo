package com.akshay.nutritioninfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.nutritioninfo.service.NutritionInfoService;

@RestController
@RequestMapping(value = "nutrition-info")
public class NutritionInfoController {
	
	@Autowired
	private NutritionInfoService nutritionInfoService;

    @RequestMapping(method = RequestMethod.GET)
    public String getNutritionInfoByFoodName(@RequestParam("name") String foodName) {
        return nutritionInfoService.getNutritionInfoByFoodName(foodName);
    }
}
