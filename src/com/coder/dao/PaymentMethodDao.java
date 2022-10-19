package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.FoodGroup;
import com.coder.model.PaymentMethod;

@Repository("paymentMethodDao")
public class PaymentMethodDao extends AbstractDao<Integer,PaymentMethod>{
	
	public PaymentMethod savePaymentMethod(PaymentMethod paymentMethod)
	{
	return (PaymentMethod)super.persist(paymentMethod);

		}

	public List<PaymentMethod> getPaymentMethods() {
		// TODO Auto-generated method stub
		return null;
	}

}
