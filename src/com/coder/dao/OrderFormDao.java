package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.OrderForm;


@Repository("orderFormDoa")
public class OrderFormDao extends AbstractDao<Integer,OrderForm>{
	
	
	public Integer saveOrderForm(OrderForm orderForm)
	{
	return (Integer)super.persist(orderForm);

		}


public void  updateOrderForm(OrderForm orderForm)
{
super.merge(orderForm);

}

public OrderForm getOrderFormById(int id,String strId){
	OrderForm orderForm=super.criteriaQuerryGetObjectById(id, strId);
	return orderForm;
	}

public List<OrderForm> getOrderForms() {
List<OrderForm> orderForms=(List<OrderForm>)super.criteriaQuerry();
	return orderForms;
}






}
