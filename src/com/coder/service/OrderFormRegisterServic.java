package com.coder.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coder.dao.AdminDao;
import com.coder.dao.OrderFormDao;
import com.coder.dao.UserDao;
import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.OrderFormForm;
import com.coder.form.OrderFormRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.model.Admin;
import com.coder.model.OrderForm;
import com.coder.model.User;
import com.coder.util.DateFormat;

@Service
@Repository("orderFormRegisterServic")
public class OrderFormRegisterServic {
	@Autowired
	private OrderFormDao orderFormDao;
	public void prepareOrderFormRegister(OrderFormRegisterForm myFrom)
	{
		if(myFrom.getOrderFormForm()!=null)
		{
			this.OrderFormRegister(myFrom);
		}
	myFrom.setOrderForms(orderFormDao.getOrderForms());
	
		
	}
	public void OrderFormRegister(OrderFormRegisterForm myFrom)
	{
		OrderForm orderForm=new OrderForm();
		OrderFormForm	orderFormForm=myFrom.getOrderFormForm();

		orderForm.setPhone(orderFormForm.getPhone());
		orderForm.setEmail(orderFormForm.getEmail());
		orderForm.setFullAddress(orderFormForm.getFullAddress());
		orderForm.setPostalCode(orderFormForm.getPostalCode());
		orderForm.setCity(orderFormForm.getCity());
		orderForm.setNotes(orderFormForm.getNotes());
		
		orderForm.setDeliveryDay(DateFormat.stringToDate(orderFormForm.getDeliveryDay()));
		orderForm.setDeliveryTime(DateFormat.stringToTime(orderFormForm.getDeliveryTime()));
		orderForm.setSession(orderFormForm.getSession());
		
		
		orderFormDao.saveOrderForm(orderForm);
		
	}
}
