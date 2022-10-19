package com.coder.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coder.dao.AdminDao;
import com.coder.dao.FoodGroupDao;
import com.coder.dao.LanguageDao;
import com.coder.dao.LanguageJoinGroupDao;
import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.FoodGroupForm;
import com.coder.form.FoodGroupRegisterForm;
import com.coder.model.Admin;
import com.coder.model.Day;
import com.coder.model.FoodGroup;
import com.coder.model.Language;
import com.coder.model.LanguageJoinGroup;
import com.coder.model.LanguageJoinGroupId;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSourceFactory;

@Service
@Repository("foodGroupRegisterServic")
public class FoodGroupRegisterServic {
	@Autowired
	private LanguageJoinGroupDao languageJoinGroupDao;
	@Autowired
	private LanguageDao languageDao;
	@Autowired
	private FoodGroupDao foodGroupDao;
	public void prepareFoodGroupRegister(FoodGroupRegisterForm myFrom)
	{
		if(myFrom.getFoodGroupForm()!=null)
		{
			this.FoodGroupRegister(myFrom);
		}
	myFrom.setFoodGroups(foodGroupDao.getFoodGroups());
	List<Language> languages=this.languageDao.getLanguages();
	for( Language s:languages){
	myFrom.getMapLanguages().put(""+s.getLanguageId(),s.getName());
	}
	
		
	}
	public void FoodGroupRegister(FoodGroupRegisterForm myFrom)
	{
		FoodGroup foodGroup=new FoodGroup();
		FoodGroupForm	foodGroupForm=myFrom.getFoodGroupForm();
		
		foodGroup.setCode(foodGroupForm.getCode());
	    Date d=new Date();
	    foodGroup.setCreateDate(d);
	   
	    
	    int  foodGroupId=foodGroupDao.saveFoodGroup(foodGroup);
	    Language language=languageDao.criteriaQuerryGetObjectById(Integer.parseInt(foodGroupForm.getLanguageId()),"languageId");
	    LanguageJoinGroup languageJoinGroup=new LanguageJoinGroup();
	    LanguageJoinGroupId languageJoinGroupId=new LanguageJoinGroupId();
	    languageJoinGroupId.setFoodGroupId(foodGroupId);
	    languageJoinGroup.setGroupName( foodGroupForm.getGroupName());
	    languageJoinGroupId.setLanguageId(language.getLanguageId());
	    languageJoinGroup.setId(languageJoinGroupId);
	    
	    languageJoinGroupDao.saveLanguageJoinGroup(languageJoinGroup);
	    
	    
	    
	    
	    
	    
	    
		
	}
}
