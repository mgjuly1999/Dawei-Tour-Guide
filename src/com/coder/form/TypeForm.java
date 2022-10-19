package com.coder.form;

import java.util.Date;

import com.coder.model.FoodGroup;
import com.coder.model.Language;
import com.coder.model.Type;
import com.coder.model.TypeJoinLanguageId;

public class TypeForm {
	private Integer typeId;
	private String foodGroupId;
	private String groupName;
	
	private String code;
	private Date createDate;
	private String languageId;
	private String typeName;
	private String description;
	
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCode() {
		return code;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLanguageId() {
		return languageId;
	}
	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}
	public String getFoodGroupId() {
		return foodGroupId;
	}
	public void setFoodGroupId(String foodGroupId) {
		this.foodGroupId = foodGroupId;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
