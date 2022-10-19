package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.LinkJoinShop;
import com.coder.model.ShopJoinLanguage;
import com.coder.model.TimeTable;
import com.coder.model.User;



@Repository("shopJoinLanguageDao")
public class ShopJoinLanguageDao extends AbstractDao<Integer,ShopJoinLanguage>{
	
	public Object saveShopJoinLanguage(ShopJoinLanguage shopJoinLanguage)
	{
	return (Object)super.persist(shopJoinLanguage);

		}

	public List<ShopJoinLanguageDao> getShopJoinLanguages() {
		
		return null;
	}




}
