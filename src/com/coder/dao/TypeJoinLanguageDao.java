package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.FoodGroup;
import com.coder.model.TypeJoinLanguage;


@Repository("typeJoinLanguageDao")
public class TypeJoinLanguageDao extends AbstractDao<Integer,TypeJoinLanguage>{
	
	public Object saveTypeJoinLanguage(TypeJoinLanguage typeJoinLanguage)
	{
	return (Object)super.persist(typeJoinLanguage);

		}


public void  updateTypeJoinLanguage(TypeJoinLanguage typeJoinLanguage)
{
super.merge(typeJoinLanguage);

}



public List<TypeJoinLanguage> getTypeJoinLanguages() {
List<TypeJoinLanguage> typeJoinLanguages=(List<TypeJoinLanguage>)super.criteriaQuerry();
	return typeJoinLanguages;
}






}
