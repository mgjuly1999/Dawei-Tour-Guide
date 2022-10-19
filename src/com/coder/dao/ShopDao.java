package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.Shop;
import com.coder.model.User;

@Repository("shopDoa")
public class ShopDao extends AbstractDao<Integer,Shop>{
	
	public Integer saveShop(Shop shop)
	{
	return (Integer)super.persist(shop);

		}

	public List<Shop> getShops() {
		List<Shop>	shops=super.criteriaQuerry();
		return shops;
	}

}
