package com.coder.form;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import com.coder.model.Address;
import com.coder.model.Shop;

public class ShopRegisterForm {
	
	private ShopForm shopForm=null;
	private Shop shop;
	private Address address;
	private List<Shop> shops;
	private Map<String,String> mapLinkTypes=new HashedMap<String,String>();
	public ShopForm getShopForm() {
		return shopForm;
	}
	public void setShopForm(ShopForm shopForm) {
		this.shopForm = shopForm;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<Shop> getShops() {
		return shops;
	}
	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}
	public Map<String, String> getMapLinkTypes() {
		return mapLinkTypes;
	}
	public void setMapLinkTypes(Map<String, String> mapLinkTypes) {
		this.mapLinkTypes = mapLinkTypes;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
