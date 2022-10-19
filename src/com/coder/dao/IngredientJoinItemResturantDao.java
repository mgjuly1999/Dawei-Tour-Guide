package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.IngredientJoinItemResturant;


@Repository("ingredientJoinItemResturantDao")
public class IngredientJoinItemResturantDao extends AbstractDao<Integer,IngredientJoinItemResturant>{
	
	public Object saveIngredientJoinItemResturant(IngredientJoinItemResturant ingredientJoinItemResturant)
	{
	return (Object)super.persist(ingredientJoinItemResturant);}

public void  updateIngredientJoinItemResturant(IngredientJoinItemResturant ingredientJoinItemResturant)
{
super.merge(ingredientJoinItemResturant);

}

public IngredientJoinItemResturant getIngredientJoinItemResturantById(int id,String strId){
	IngredientJoinItemResturant ingredientJoinItemResturant=super.criteriaQuerryGetObjectById(id, strId);
	return ingredientJoinItemResturant;
	}

public List<IngredientJoinItemResturant> getIngredientJoinItemResturants() {
List<IngredientJoinItemResturant> ingredientJoinItemResturants=(List<IngredientJoinItemResturant>)super.criteriaQuerry();
	return ingredientJoinItemResturants;
}






}
