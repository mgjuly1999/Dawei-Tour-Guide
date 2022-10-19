package com.coder.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coder.dao.AdminDao;
import com.coder.dao.PaymentMethodDao;
import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.PaymentMethodForm;
import com.coder.form.PaymentMethodRegisterForm;
import com.coder.model.Admin;
import com.coder.model.PaymentMethod;
import com.coder.util.DateFormat;

@Service
@Repository("paymentMethodRegisterServic")
public class PaymentMethodRegisterServic {
	@Autowired
	private PaymentMethodDao paymentMethodDao;
	public void preparePaymentMethodRegister(PaymentMethodRegisterForm myFrom)
	{
		if(myFrom.getPaymentMethodForm()!=null)
		{
			this.PaymentMethodRegister(myFrom);
		}
	myFrom.setPaymentMethods(paymentMethodDao.getPaymentMethods());
	
		
	}
	public void PaymentMethodRegister(PaymentMethodRegisterForm myFrom)
	{
		PaymentMethod paymentMethod=new PaymentMethod();
		PaymentMethodForm	paymentMethodForm=myFrom.getPaymentMethodForm();
	
	
	    paymentMethod.setPaymentMethods(paymentMethodForm.getPaymentMethods());
	    paymentMethod.setCardNumber(paymentMethodForm.getCardNumber());
	    paymentMethod.setCardOwner(paymentMethodForm.getCardOwner());
	    paymentMethod.setSecurityCode(paymentMethodForm.getSecurityCode());
	    paymentMethod.setExpirationDate(DateFormat.stringToDate(paymentMethodForm.getExpirationDate()));
		System.out.println(paymentMethod.getCardNumber());
		System.out.println(paymentMethod.getCardOwner());
		
		myFrom.setPaymentMethod(paymentMethodDao.savePaymentMethod(paymentMethod));
		
	}
}
