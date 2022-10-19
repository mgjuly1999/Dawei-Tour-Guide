package com.coder.form;

import java.util.List;

import com.coder.model.FoodGroup;
import com.coder.model.PaymentMethod;

public class PaymentMethodRegisterForm {
	private PaymentMethodForm paymentMethodForm=null;
	private PaymentMethod paymentMethod;
	private List<PaymentMethod> paymentMethods;
	public PaymentMethodForm getPaymentMethodForm() {
		return paymentMethodForm;
	}
	public void setPaymentMethodForm(PaymentMethodForm paymentMethodForm) {
		this.paymentMethodForm = paymentMethodForm;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public List<PaymentMethod> getPaymentMethods() {
		return paymentMethods;
	}
	public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
		this.paymentMethods = paymentMethods;
	}
	
	
}
