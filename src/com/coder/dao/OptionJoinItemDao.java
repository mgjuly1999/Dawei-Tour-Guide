package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.OptionJoinItem;


@Repository("optionJoinItemDao")
public class OptionJoinItemDao extends AbstractDao<Integer,OptionJoinItem>{
	
	public Object saveOptionJoinItem(OptionJoinItem optionJoinItem)
	{
	return (Object)super.persist(optionJoinItem);

		}


public void  updateOptionJoinItem(OptionJoinItem optionJoinItem)
{
super.merge(optionJoinItem);

}

public OptionJoinItem getOptionJoinItemById(int id,String strId){
	OptionJoinItem optionJoinItem=super.criteriaQuerryGetObjectById(id, strId);
	return optionJoinItem;
	}

public List<OptionJoinItem> getOptionJoinItems() {
List<OptionJoinItem> optionJoinItems=(List<OptionJoinItem>)super.criteriaQuerry();
	return optionJoinItems;
}






}
