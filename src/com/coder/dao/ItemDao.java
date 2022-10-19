package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.Item;


@Repository("itemDao")
public class ItemDao extends AbstractDao<Integer,Item>{
	
	public Integer saveItem(Item item)
	{
	return (Integer)super.persist(item);

		}


public void  updateItem(Item item)
{
super.merge(item);

}

public Item getItemById(int id,String strId){
	Item item=super.criteriaQuerryGetObjectById(id, strId);
	return item;
	}

public List<Item> getItems() {
List<Item> items=(List<Item>)super.criteriaQuerry();
	return items;
}






}
