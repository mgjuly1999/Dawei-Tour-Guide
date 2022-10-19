package com.coder.form;

import java.util.Date;

public class FoodGroupForm {
	private String foodGroupId;
	private String code;
	private String createDate;
	
	private String languageId;
	private String name;
	private String languageCode;
	
	private String groupName;
	
	
	public String getLanguageId() {
		return languageId;
	}
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodGroupId() {
		return foodGroupId;
	}
	public void setFoodGroupId(String foodGroupId) {
		this.foodGroupId = foodGroupId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
