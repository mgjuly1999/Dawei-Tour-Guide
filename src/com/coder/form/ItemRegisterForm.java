package com.coder.form;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import com.coder.model.Admin;
import com.coder.model.Item;
import com.coder.model.Type;

public class ItemRegisterForm {
	private ItemForm itemForm=null;
	private Type type;
	private Item item;
	private List<Item> items;
	private List<Type> types;
	private Map<String,String> mapTypes=new HashedMap<String,String>();
	private Map<String,String> mapIngredients=new HashedMap<String,String>();
	private Map<String,String> mapItemOptions=new HashedMap<String,String>();
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Map<String, String> getMapIngredients() {
		return mapIngredients;
	}
	public void setMapIngredients(Map<String, String> mapIngredients) {
		this.mapIngredients = mapIngredients;
	}
	public Map<String, String> getMapItemOptions() {
		return mapItemOptions;
	}
	public void setMapItemOptions(Map<String, String> mapItemOptions) {
		this.mapItemOptions = mapItemOptions;
	}
	public ItemForm getItemForm() {
		return itemForm;
	}
	public void setItemForm(ItemForm itemForm) {
		this.itemForm = itemForm;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public List<Item> getItems() {
		return items;
	}
	public Map<String, String> getMapTypes() {
		return mapTypes;
	}
	public void setMapTypes(Map<String, String> mapTypes) {
		this.mapTypes = mapTypes;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	
}
