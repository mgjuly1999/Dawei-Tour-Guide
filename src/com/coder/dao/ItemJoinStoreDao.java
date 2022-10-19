package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.ItemJoinStore;


@Repository("itemJoinStoreDao")
public class ItemJoinStoreDao extends AbstractDao<Integer,ItemJoinStore>{
	
	public Integer saveItemJoinStore(ItemJoinStore itemJoinStore)
	{
	return (Integer)super.persist(itemJoinStore);

		}


public void  updateItemJoinStore(ItemJoinStore itemJoinStore)
{
super.merge(itemJoinStore);

}

public ItemJoinStore getItemJoinStoreById(int id,String strId){
	ItemJoinStore itemJoinStore=super.criteriaQuerryGetObjectById(id, strId);
	return itemJoinStore;
	}

public List<ItemJoinStore> getItemJoinStores() {
List<ItemJoinStore> itemJoinStores=(List<ItemJoinStore>)super.criteriaQuerry();
	return itemJoinStores;
}






}
