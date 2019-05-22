package com.akshay.nutritioninfo.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.akshay.nutritioninfo.entity.Common;
import com.akshay.nutritioninfo.entity.FoodType;
import com.akshay.nutritioninfo.entity.Nutrition;

@Service
public class NutritionInfoServiceImpl implements NutritionInfoService{

	private final String getUri = "https://trackapi.nutritionix.com/v2/search/instant?query=";
	private final String postUri = "https://trackapi.nutritionix.com/v2/natural/nutrients";
	
	@Override
	public Nutrition getNutritionInfoByFoodName(String foodName, String xUserJwt, String xAppId, String xAppKey) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.set("x-user-jwt", xUserJwt);
		headers.set("x-app-id", xAppId);
		headers.set("x-app-key", xAppKey);
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<FoodType> response = restTemplate.exchange(getUri + foodName, HttpMethod.GET, entity, FoodType.class);
		
		Common commonFoodInfo = response.getBody().getCommon().get(0);
		String query = commonFoodInfo.getServingUnit() + " " + commonFoodInfo.getFoodName();  
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("query", query);

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
		ResponseEntity<Nutrition> finalResponse = restTemplate.postForEntity( postUri, request , Nutrition.class );
		finalResponse.getBody().getFoods().get(0).setFood_details(query);
		return finalResponse.getBody();
	}
	
}
