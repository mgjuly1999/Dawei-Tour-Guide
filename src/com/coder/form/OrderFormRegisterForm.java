package com.coder.form;

import java.util.List;

import com.coder.model.Admin;
import com.coder.model.OrderForm;
public class OrderFormRegisterForm {
	private OrderFormForm orderFormForm=null;
	private OrderForm orderForm;
	private List<OrderForm> OrderForms;
	public OrderFormForm getOrderFormForm() {
		return orderFormForm;
	}
	public void setOrderFormForm(OrderFormForm orderFormForm) {
		this.orderFormForm = orderFormForm;
	}
	public OrderForm getOrderForm() {
		return orderForm;
	}
	public void setOrderForm(OrderForm orderForm) {
		this.orderForm = orderForm;
	}
	public List<OrderForm> getOrderForms() {
		return OrderForms;
	}
	public void setOrderForms(List<OrderForm> orderForms) {
		OrderForms = orderForms;
	}
}
