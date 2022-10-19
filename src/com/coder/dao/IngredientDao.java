package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.Ingredient;


@Repository("ingredientDao")
public class IngredientDao extends AbstractDao<Integer,Ingredient>{
	
	public Integer saveIngredient(Ingredient ingredient)
	{
	return (Integer)super.persist(ingredient);

		}


public void  updateIngredient(Ingredient ingredient)
{
super.merge(ingredient);

}

public Ingredient getIngredientById(int id,String strId){
	Ingredient ingredient=super.criteriaQuerryGetObjectById(id, strId);
	return ingredient;
	}

public List<Ingredient> getIngredients() {
List<Ingredient> ingredients=(List<Ingredient>)super.criteriaQuerry();
	return ingredients;
}






}
