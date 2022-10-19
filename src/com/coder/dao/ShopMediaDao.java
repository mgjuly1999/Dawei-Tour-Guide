package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.ShopMedia;


@Repository("shopMediaDao")
public class ShopMediaDao extends AbstractDao<Integer,ShopMedia>{
	
	public Integer saveShopMedia(ShopMedia shopMedia)
	{
	return (Integer)super.persist(shopMedia);

		}


public void  updateShopMedia(ShopMedia shopMedia)
{
super.merge(shopMedia);

}

public ShopMedia getShopMediaById(int id,String strId){
	ShopMedia shopMedia=super.criteriaQuerryGetObjectById(id, strId);
	return shopMedia;
	}

public List<ShopMedia> getShopMedias() {
List<ShopMedia> shopMedias=(List<ShopMedia>)super.criteriaQuerry();
	return shopMedias;
}






}
