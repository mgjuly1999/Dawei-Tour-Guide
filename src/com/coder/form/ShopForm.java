package com.coder.form;

import java.util.Date;

import com.coder.model.Admin;
import com.coder.model.Language;
import com.coder.model.Shop;
import com.coder.model.ShopJoinLanguageId;
import com.coder.model.TimeTableId;

public class ShopForm {
	private Integer shopId;
	
	private String name;
	private String createDate;
	private Integer addressId;
	
	private String street;
	private String city;
	private String postalCode;
	private String fullAddress;
	private String quarter;
	private String lat;
	private String laung;
	private String phone;
	
	private String dayId;
	private String dayName;
	private String startTime;
	private String endTime;
	
	private String linkTypeId;
	private String linkTypeName;
	private String link;
	
	private String description;
	private String aboutUs;
	
	private String shopMediaId;
	private String mediaName;
	private String mediaType;
	
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLaung() {
		return laung;
	}
	public void setLaung(String laung) {
		this.laung = laung;
	}
	public String getDayId() {
		return dayId;
	}
	public void setDayId(String dayId) {
		this.dayId = dayId;
	}
	public String getLinkTypeId() {
		return linkTypeId;
	}
	public void setLinkTypeId(String linkTypeId) {
		this.linkTypeId = linkTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public String getShopMediaId() {
		return shopMediaId;
	}
	public void setShopMediaId(String shopMediaId) {
		this.shopMediaId = shopMediaId;
	}
	public String getMediaName() {
		return mediaName;
	}
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}
	public String getMediaType() {
		return mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAboutUs() {
		return aboutUs;
	}
	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	public String getLinkTypeName() {
		return linkTypeName;
	}
	public void setLinkTypeName(String linkTypeName) {
		this.linkTypeName = linkTypeName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
