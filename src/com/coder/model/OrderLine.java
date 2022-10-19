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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrderLine generated by hbm2java
 */
@Entity
@Table(name = "order_line", catalog = "traveldb")
public class OrderLine implements java.io.Serializable {

	private Integer orderLineId;
	private OrderForm orderForm;
	private PaymentMethod paymentMethod;
	private double totalPrice;
	private Date orderDate;
	private String orderStatus;
	private double totalDiscountRate;
	private double totalDeliveryCost;
	private Set<Orders> orderses = new HashSet<Orders>(0);

	public OrderLine() {
	}

	public OrderLine(OrderForm orderForm, PaymentMethod paymentMethod, double totalPrice, Date orderDate,
			String orderStatus, double totalDiscountRate, double totalDeliveryCost) {
		this.orderForm = orderForm;
		this.paymentMethod = paymentMethod;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.totalDiscountRate = totalDiscountRate;
		this.totalDeliveryCost = totalDeliveryCost;
	}

	public OrderLine(OrderForm orderForm, PaymentMethod paymentMethod, double totalPrice, Date orderDate,
			String orderStatus, double totalDiscountRate, double totalDeliveryCost, Set<Orders> orderses) {
		this.orderForm = orderForm;
		this.paymentMethod = paymentMethod;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.totalDiscountRate = totalDiscountRate;
		this.totalDeliveryCost = totalDeliveryCost;
		this.orderses = orderses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "order_line_id", unique = true, nullable = false)
	public Integer getOrderLineId() {
		return this.orderLineId;
	}

	public void setOrderLineId(Integer orderLineId) {
		this.orderLineId = orderLineId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_form_id", nullable = false)
	public OrderForm getOrderForm() {
		return this.orderForm;
	}

	public void setOrderForm(OrderForm orderForm) {
		this.orderForm = orderForm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payment_method_id", nullable = false)
	public PaymentMethod getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Column(name = "total_price", nullable = false, precision = 22, scale = 0)
	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "order_date", nullable = false, length = 10)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "order_status", nullable = false, length = 100)
	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Column(name = "total_discount_rate", nullable = false, precision = 22, scale = 0)
	public double getTotalDiscountRate() {
		return this.totalDiscountRate;
	}

	public void setTotalDiscountRate(double totalDiscountRate) {
		this.totalDiscountRate = totalDiscountRate;
	}

	@Column(name = "total_delivery_cost", nullable = false, precision = 22, scale = 0)
	public double getTotalDeliveryCost() {
		return this.totalDeliveryCost;
	}

	public void setTotalDeliveryCost(double totalDeliveryCost) {
		this.totalDeliveryCost = totalDeliveryCost;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orderLine")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

}
