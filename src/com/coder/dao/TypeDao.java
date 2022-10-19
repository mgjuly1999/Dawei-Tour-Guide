package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.Type;
import com.coder.model.User;

@Repository("typeDao")
public class TypeDao extends AbstractDao<Integer,Type>{
	
	public Integer saveType(Type type)
	{
	return (Integer)super.persist(type);}
	
	public Type getTypeById(int id,String strId){
		Type type=super.criteriaQuerryGetObjectById(id, strId);
		return type;}
	
	public void  updateType(Type type)
	{
	super.merge(type);
	}

	public List<Type> getTypes() {
		List<Type> types=super.criteriaQuerry();
		return types;
	}

}
