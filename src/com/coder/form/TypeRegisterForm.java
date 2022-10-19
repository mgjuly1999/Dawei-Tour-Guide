package com.coder.form;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import com.coder.model.Admin;
import com.coder.model.Type;

public class TypeRegisterForm {
	
	private TypeForm typeForm=null;
	private Type type;
	private List<Type> types;
	private Map<String,String> mapLanguages=new HashedMap<String,String>();
	private Map<String,String> mapFoodGroups=new HashedMap<String,String>();
	public TypeForm getTypeForm() {
		return typeForm;
	}
	public void setTypeForm(TypeForm typeForm) {
		this.typeForm = typeForm;
	}
	public Map<String, String> getMapLanguages() {
		return mapLanguages;
	}
	public void setMapLanguages(Map<String, String> mapLanguages) {
		this.mapLanguages = mapLanguages;
	}
	public Type getType() {
		return type;
	}
	
	public Map<String, String> getMapFoodGroups() {
		return mapFoodGroups;
	}
	public void setMapFoodGroups(Map<String, String> mapFoodGroups) {
		this.mapFoodGroups = mapFoodGroups;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public List<Type> getTypes() {
		return types;
	}
	
	public void setTypes(List<Type> types) {
		this.types = types;
	}
}
