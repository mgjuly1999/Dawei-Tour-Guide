package com.coder.model;
// Generated Jan 23, 2020 8:11:18 PM by Hibernate Tools 5.0.6.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ItemJoinStore generated by hbm2java
 */
@Entity
@Table(name = "item_join_store", catalog = "traveldb")
public class ItemJoinStore implements java.io.Serializable {

	private Integer itemJoinStoreId;
	private Item item;
	private Shop shop;
	private Date createDate;
	private int qty;
	private double deliverCostPerMeter;
	private Set<ItemImage> itemImages = new HashSet<ItemImage>(0);
	private Set<Orders> orderses = new HashSet<Orders>(0);
	private Set<ReviewCommand> reviewCommands = new HashSet<ReviewCommand>(0);
	private Set<OptionJoinItem> optionJoinItems = new HashSet<OptionJoinItem>(0);
	private Set<IngredientJoinItemResturant> ingredientJoinItemResturants = new HashSet<IngredientJoinItemResturant>(0);

	public ItemJoinStore() {
	}

	public ItemJoinStore(int itemJoinStoreId, Item item, Shop shop, Date createDate, int qty,
			double deliverCostPerMeter) {
		this.itemJoinStoreId = itemJoinStoreId;
		this.item = item;
		this.shop = shop;
		this.createDate = createDate;
		this.qty = qty;
		this.deliverCostPerMeter = deliverCostPerMeter;
	}

	public ItemJoinStore(int itemJoinStoreId, Item item, Shop shop, Date createDate, int qty,
			double deliverCostPerMeter, Set<ItemImage> itemImages, Set<Orders> orderses,
			Set<ReviewCommand> reviewCommands, Set<OptionJoinItem> optionJoinItems,
			Set<IngredientJoinItemResturant> ingredientJoinItemResturants) {
		this.itemJoinStoreId = itemJoinStoreId;
		this.item = item;
		this.shop = shop;
		this.createDate = createDate;
		this.qty = qty;
		this.deliverCostPerMeter = deliverCostPerMeter;
		this.itemImages = itemImages;
		this.orderses = orderses;
		this.reviewCommands = reviewCommands;
		this.optionJoinItems = optionJoinItems;
		this.ingredientJoinItemResturants = ingredientJoinItemResturants;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "item_join_store_id", unique = true, nullable = false)
	public Integer getItemJoinStoreId() {
		return this.itemJoinStoreId;
	}

	public void setItemJoinStoreId(Integer itemJoinStoreId) {
		this.itemJoinStoreId = itemJoinStoreId;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "item_id", nullable = false)
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "shop_id", nullable = false)
	public Shop getShop() {
		return this.shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", nullable = false, length = 10)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "qty", nullable = false)
	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Column(name = "deliver_cost_per_meter", nullable = false, precision = 22, scale = 0)
	public double getDeliverCostPerMeter() {
		return this.deliverCostPerMeter;
	}

	public void setDeliverCostPerMeter(double deliverCostPerMeter) {
		this.deliverCostPerMeter = deliverCostPerMeter;
	}

	@OneToMany(cascade=CascadeType.ALL, mappedBy = "itemJoinStore")
	public Set<ItemImage> getItemImages() {
		return this.itemImages;
	}

	public void setItemImages(Set<ItemImage> itemImages) {
		this.itemImages = itemImages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "itemJoinStore")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "itemJoinStore")
	public Set<ReviewCommand> getReviewCommands() {
		return this.reviewCommands;
	}

	public void setReviewCommands(Set<ReviewCommand> reviewCommands) {
		this.reviewCommands = reviewCommands;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "itemJoinStore")
	public Set<OptionJoinItem> getOptionJoinItems() {
		return this.optionJoinItems;
	}

	public void setOptionJoinItems(Set<OptionJoinItem> optionJoinItems) {
		this.optionJoinItems = optionJoinItems;
	}

	@OneToMany(cascade=CascadeType.ALL, mappedBy = "itemJoinStore")
	public Set<IngredientJoinItemResturant> getIngredientJoinItemResturants() {
		return this.ingredientJoinItemResturants;
	}

	public void setIngredientJoinItemResturants(Set<IngredientJoinItemResturant> ingredientJoinItemResturants) {
		this.ingredientJoinItemResturants = ingredientJoinItemResturants;
	}

}