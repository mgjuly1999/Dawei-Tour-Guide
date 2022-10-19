package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.ItemOption;


@Repository("itemOptionDao")
public class ItemOptionDao extends AbstractDao<Integer,ItemOption>{
	
public Integer saveItemOption(ItemOption itemOption)
	{return (Integer)super.persist(itemOption);}

public void  updateItemOption(ItemOption itemOption)
{super.merge(itemOption);}

public ItemOption getItemOptionById(int id,String strId){
	ItemOption itemOption=super.criteriaQuerryGetObjectById(id, strId);
	return itemOption;}

public List<ItemOption> getItemOptions() {
List<ItemOption> itemOptions=(List<ItemOption>)super.criteriaQuerry();
	return itemOptions;
}






}
