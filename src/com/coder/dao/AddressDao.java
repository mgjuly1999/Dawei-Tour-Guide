package com.coder.dao;



import org.springframework.stereotype.Repository;

import com.coder.model.Address;




@Repository("addressDoa")
public class AddressDao extends AbstractDao<Integer,Address>{
	
	public Address saveAddress(Address address)
	{
	return (Address)super.persist(address);

		}


public void  updateAddress(Address address)
{
super.merge(address);

}



}
