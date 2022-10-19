package com.coder.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coder.dao.AdminDao;
import com.coder.dao.FoodGroupDao;
import com.coder.dao.LanguageDao;
import com.coder.dao.TypeDao;
import com.coder.dao.TypeJoinLanguageDao;
import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.FoodGroupForm;
import com.coder.form.FoodGroupRegisterForm;
import com.coder.form.TypeForm;
import com.coder.form.TypeRegisterForm;
import com.coder.model.Admin;
import com.coder.model.FoodGroup;
import com.coder.model.Language;
import com.coder.model.Type;

@Service
@Repository("typeRegisterServic")
public class TypeRegisterServic {
	@Autowired
	private LanguageDao languageDao;
	@Autowired
	private TypeJoinLanguageDao typeJoinLanguageDao;
	@Autowired
	private TypeDao typeDao;
	@Autowired
	private FoodGroupDao foodGroupDao;
	public void prepareTypeRegister(TypeRegisterForm myFrom)
	{
		if(myFrom.getTypeForm()!=null)
		{
			this.TypeRegister(myFrom);
		}
	myFrom.setTypes(typeDao.getTypes());
	
	List<Language> languages=this.languageDao.getLanguages();
	for( Language s:languages){
	myFrom.getMapLanguages().put(""+s.getLanguageId(),s.getName());
	}
	List<FoodGroup> foodGroups=this.foodGroupDao.getFoodGroups();
	for( FoodGroup f:foodGroups){
	myFrom.getMapFoodGroups().put(""+f.getFoodGroupId(),f.getCode());
	}
	
	}
	public void TypeRegister(TypeRegisterForm myFrom)	
{        
		TypeForm	typeForm=myFrom.getTypeForm();
		FoodGroup foodGroup=new FoodGroup();
		foodGroup.setFoodGroupId(2);
		
		Type type=new Type();
	
		type.setCode(typeForm.getCode());
		type.setCreateDate(new Date());
	
		Set<Type> types=new HashSet<Type>();
		types.add(type);
		
		foodGroup.setTypes(types);
		type.setFoodGroup(foodGroup);
		
		this.typeDao.saveType(type);
		
	}
}
