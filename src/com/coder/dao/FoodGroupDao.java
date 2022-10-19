package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.FoodGroup;

@Repository("foodGroupDoa")
public class FoodGroupDao extends AbstractDao<Integer,FoodGroup>{
	
	
	public Integer saveFoodGroup(FoodGroup foodGroup)
	{
	return (Integer)super.persist(foodGroup);

		}


public void  updateFoodGroup(FoodGroup foodGroup)
{
super.merge(foodGroup);

}

public FoodGroup getFoodGroupById(int id,String strId){
	FoodGroup foodGroup=super.criteriaQuerryGetObjectById(id, strId);
	return foodGroup;
	}

public List<FoodGroup> getFoodGroups() {
List<FoodGroup> foodGroups=(List<FoodGroup>)super.criteriaQuerry();
	return foodGroups;
}






}
