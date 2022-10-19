package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.LanguageJoinGroup;


@Repository("languageJoinGroupDao")
public class LanguageJoinGroupDao extends AbstractDao<Integer,LanguageJoinGroup>{
	
	public Object saveLanguageJoinGroup(LanguageJoinGroup languageJoinGroup)
	{
	return (Object)super.persist(languageJoinGroup);

		}


public void  updateLanguageJoinGroup(LanguageJoinGroup languageJoinGroup)
{
super.merge(languageJoinGroup);

}

public LanguageJoinGroup getLanguageJoinGroupById(int id,String strId){
	LanguageJoinGroup languageJoinGroup=super.criteriaQuerryGetObjectById(id, strId);
	return languageJoinGroup;
	}

public List<LanguageJoinGroup> getLanguageJoinGroups() {
List<LanguageJoinGroup> languageJoinGroups=(List<LanguageJoinGroup>)super.criteriaQuerry();
	return languageJoinGroups;
}






}
