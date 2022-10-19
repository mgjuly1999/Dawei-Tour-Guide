package com.coder.form;

import com.coder.model.ItemJoinStore;

public class ItemForm {
	
	private Integer itemId;
	private String itemOriginalName;
	
	private String typeode;
	private Integer typeId;
	private Integer foodGroupId;
	private String foodGroupCode;
	
	private String itemJoinStoreId;
	private String createDate;
	private String qty;
	private String deliverCostPerMeter;
	
	private String ingredientId;
	private String name;
	private String addionalPrice;
	
	private String itemImageId;
	private String imageName;
	
	private String itemOptionId;
	private String optionName;
	private String price;
	
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemOriginalName() {
		return itemOriginalName;
	}
	public void setItemOriginalName(String itemOriginalName) {
		this.itemOriginalName = itemOriginalName;
	}
	public String getTypeode() {
		return typeode;
	}
	public void setTypeode(String typeode) {
		this.typeode = typeode;
	}
	public String getItemImageId() {
		return itemImageId;
	}
	public void setItemImageId(String itemImageId) {
		this.itemImageId = itemImageId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public String getItemOptionId() {
		return itemOptionId;
	}
	public void setItemOptionId(String itemOptionId) {
		this.itemOptionId = itemOptionId;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public Integer getFoodGroupId() {
		return foodGroupId;
	}
	public void setFoodGroupId(Integer foodGroupId) {
		this.foodGroupId = foodGroupId;
	}
	public String getItemJoinStoreId() {
		return itemJoinStoreId;
	}
	public void setItemJoinStoreId(String itemJoinStoreId) {
		this.itemJoinStoreId = itemJoinStoreId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getDeliverCostPerMeter() {
		return deliverCostPerMeter;
	}
	public void setDeliverCostPerMeter(String deliverCostPerMeter) {
		this.deliverCostPerMeter = deliverCostPerMeter;
	}
	public String getIngredientId() {
		return ingredientId;
	}
	public void setIngredientId(String ingredientId) {
		this.ingredientId = ingredientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddionalPrice() {
		return addionalPrice;
	}
	public void setAddionalPrice(String addionalPrice) {
		this.addionalPrice = addionalPrice;
	}
	public String getFoodGroupCode() {
		return foodGroupCode;
	}
	public void setFoodGroupCode(String foodGroupCode) {
		this.foodGroupCode = foodGroupCode;
	}

}
