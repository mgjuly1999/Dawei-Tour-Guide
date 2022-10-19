package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.Language;


@Repository("languageDao")
public class LanguageDao extends AbstractDao<Integer,Language>{
	
	public Integer saveLanguage(Language language)
	{
	return (Integer)super.persist(language);

		}


public void  updateLanguage(Language language)
{
super.merge(language);

}

public Language getLanguageById(int id,String strId){
	Language language=super.criteriaQuerryGetObjectById(id, strId);
	return language;
	}

public List<Language> getLanguages() {
List<Language> languages=(List<Language>)super.criteriaQuerry();
	return languages;
}






}
