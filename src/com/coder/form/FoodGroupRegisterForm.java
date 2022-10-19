package com.coder.form;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import com.coder.model.FoodGroup;
import com.coder.model.User;

public class FoodGroupRegisterForm {
	private FoodGroupForm foodGroupForm=null;
	private FoodGroup foodGroup;
	private List<FoodGroup> foodGroups;
	private Map<String,String> mapLanguages=new HashedMap<String,String>();
	private Map<String,String> mapFoodGroups=new HashedMap<String,String>();
	public FoodGroupForm getFoodGroupForm() {
		return foodGroupForm;
	}
	public void setFoodGroupForm(FoodGroupForm foodGroupForm) {
		this.foodGroupForm = foodGroupForm;
	}
	public FoodGroup getFoodGroup() {
		return foodGroup;
	}
	public void setFoodGroup(FoodGroup foodGroup) {
		this.foodGroup = foodGroup;
	}
	public Map<String, String> getMapFoodGroups() {
		return mapFoodGroups;
	}
	public void setMapFoodGroups(Map<String, String> mapFoodGroups) {
		this.mapFoodGroups = mapFoodGroups;
	}
	public Map<String, String> getMapLanguages() {
		return mapLanguages;
	}
	public void setMapLanguages(Map<String, String> mapLanguages) {
		this.mapLanguages = mapLanguages;
	}
	public List<FoodGroup> getFoodGroups() {
		return foodGroups;
	}
	public void setFoodGroups(List<FoodGroup> foodGroups) {
		this.foodGroups = foodGroups;
	}
}
