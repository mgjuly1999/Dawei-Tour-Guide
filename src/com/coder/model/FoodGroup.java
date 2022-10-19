package com.coder.model;
// Generated Jan 23, 2020 8:11:18 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FoodGroup generated by hbm2java
 */
@Entity
@Table(name = "food_group", catalog = "traveldb")
public class FoodGroup implements java.io.Serializable {

	private Integer foodGroupId;
	private String code;
	private Date createDate;
	private Set<LanguageJoinGroup> languageJoinGroups = new HashSet<LanguageJoinGroup>(0);
	private Set<Type> types = new HashSet<Type>(0);

	public FoodGroup() {
	}

	public FoodGroup(String code, Date createDate) {
		this.code = code;
		this.createDate = createDate;
	}

	public FoodGroup(String code, Date createDate, Set<LanguageJoinGroup> languageJoinGroups, Set<Type> types) {
		this.code = code;
		this.createDate = createDate;
		this.languageJoinGroups = languageJoinGroups;
		this.types = types;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "food_group_id", unique = true, nullable = false)
	public Integer getFoodGroupId() {
		return this.foodGroupId;
	}

	public void setFoodGroupId(Integer foodGroupId) {
		this.foodGroupId = foodGroupId;
	}

	@Column(name = "code", nullable = false, length = 7)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", nullable = false, length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "foodGroup")
	public Set<LanguageJoinGroup> getLanguageJoinGroups() {
		return this.languageJoinGroups;
	}

	public void setLanguageJoinGroups(Set<LanguageJoinGroup> languageJoinGroups) {
		this.languageJoinGroups = languageJoinGroups;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "foodGroup")
	public Set<Type> getTypes() {
		return this.types;
	}

	public void setTypes(Set<Type> types) {
		this.types = types;
	}

}
