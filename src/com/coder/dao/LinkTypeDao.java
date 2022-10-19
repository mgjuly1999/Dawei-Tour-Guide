package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.LinkType;


@Repository("linkTypeDoa")
public class LinkTypeDao extends AbstractDao<Integer,LinkType>{
	
	public Integer saveLinkType(LinkType linkType)
	{
	return (Integer)super.persist(linkType);

		}


public void  updateLinkType(LinkType linkType)
{
super.merge(linkType);

}

public LinkType getLinkTypeById(int id,String strId){
	LinkType linkType=super.criteriaQuerryGetObjectById(id, strId);
	return linkType;
	}

public List<LinkType> getLinkTypes() {
List<LinkType> linkTypes=(List<LinkType>)super.criteriaQuerry();
	return linkTypes;
}






}
