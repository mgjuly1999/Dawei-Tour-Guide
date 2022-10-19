package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.LinkJoinShop;
import com.coder.model.TimeTable;
import com.coder.model.User;



@Repository("linkJoinShopDao")
public class LinkJoinShopDao extends AbstractDao<Integer,LinkJoinShop>{
	
	public Object saveLinkJoinShop(LinkJoinShop linkJoinShop)
	{
	return (Object)super.persist(linkJoinShop);

		}

	public List<LinkJoinShop> getLinkJoinShops() {
		
		return null;
	}




}
