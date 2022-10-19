package com.coder.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coder.dao.AdminDao;
import com.coder.dao.IngredientDao;
import com.coder.dao.IngredientJoinItemResturantDao;
import com.coder.dao.ItemDao;
import com.coder.dao.ItemJoinStoreDao;
import com.coder.dao.ItemOptionDao;
import com.coder.dao.OptionJoinItemDao;
import com.coder.dao.ShopDao;
import com.coder.dao.TypeDao;
import com.coder.dao.UserDao;
import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.ItemForm;
import com.coder.form.ItemRegisterForm;
import com.coder.form.TypeRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.model.Admin;
import com.coder.model.AdminRole;
import com.coder.model.Ingredient;
import com.coder.model.IngredientJoinItemResturant;
import com.coder.model.IngredientJoinItemResturantId;
import com.coder.model.Item;
import com.coder.model.ItemImage;
import com.coder.model.ItemJoinStore;
import com.coder.model.ItemOption;
import com.coder.model.OptionJoinItem;
import com.coder.model.OptionJoinItemId;
import com.coder.model.Shop;
import com.coder.model.Type;
import com.coder.model.User;

@Service
@Repository("itemRegisterServic")
public class ItemRegisterServic {
	@Autowired
	private OptionJoinItemDao optionJoinItemDao;
	@Autowired
	private ItemOptionDao itemOptionDao;
	@Autowired
	private IngredientDao ingredientDao;
	@Autowired
	private ShopDao shopDao;
	@Autowired
	private IngredientJoinItemResturantDao ingredientJoinItemResturantDao;
	@Autowired
	private ItemJoinStoreDao itemJoinStoreDao;
	@Autowired
	private ItemDao itemDao;
	@Autowired
	private TypeDao typeDao;
	
	public void prepareItemRegister(ItemRegisterForm myFrom)
	{
		if(myFrom.getItemForm()!=null)
		{
			this.itemRegister(myFrom);
		}
	myFrom.setItems(itemDao.getItems());
	List<Type> types=this.typeDao.getTypes();
	for( Type s:types){
	myFrom.getMapTypes().put(""+s.getTypeId(),s.getCode());
	}
	List<Ingredient> ingredients=this.ingredientDao.getIngredients();
	for( Ingredient i:ingredients){
	myFrom.getMapIngredients().put(""+i.getIngredientId(),i.getName())	;
	}
	List<ItemOption> itemOptions=this.itemOptionDao.getItemOptions();
	for( ItemOption o:itemOptions){
	myFrom.getMapItemOptions().put(""+o.getItemOptionId(),o.getOptionName())	;
	}
	
	}
	
	public void itemRegister(ItemRegisterForm myFrom)
	{ 
	ItemJoinStore itemJoinStore=new ItemJoinStore();
	Item item=new Item();
	ItemForm itemFrom=myFrom.getItemForm();
	ItemImage itemImage=new ItemImage();
	
	
	Type type=typeDao.getTypeById(itemFrom.getTypeId(),"typeId");
	
	itemJoinStore.setCreateDate(new Date());
	itemJoinStore.setQty(Integer.parseInt(itemFrom.getQty()));
	itemJoinStore.setDeliverCostPerMeter(Double.parseDouble(itemFrom.getDeliverCostPerMeter()));
	
		
		item.setItemOriginalName(itemFrom.getItemOriginalName());
		item.getTypes().add(type);
		type.getItems().add(item);
		
		int itemId=itemDao.saveItem(item);
		
		item=itemDao.criteriaQuerryGetObjectById(itemId,"itemId");
		Shop shop=shopDao.criteriaQuerryGetObjectById(1,"shopId");
		
		itemImage.setImageName("photo name");
		itemJoinStore.getItemImages().add(itemImage);
		itemImage.setItemJoinStore(itemJoinStore);
		
		itemJoinStore.setItem(item);
		itemJoinStore.setShop(shop);
	
		int itemJoinStoreId=itemJoinStoreDao.saveItemJoinStore(itemJoinStore);
		
		Ingredient ingredient=ingredientDao.getIngredientById(Integer.parseInt(itemFrom.getIngredientId()),"ingredientId");
		
		IngredientJoinItemResturantId ingredientJoinItemResturantId=new IngredientJoinItemResturantId();
		ingredientJoinItemResturantId.setIngredientId(ingredient.getIngredientId());
		ingredientJoinItemResturantId.setItemJoinStoreId(itemJoinStoreId);
		IngredientJoinItemResturant ingredientJoinItemResturan=new IngredientJoinItemResturant();
		ingredientJoinItemResturan.setId(ingredientJoinItemResturantId);
		
		ingredientJoinItemResturantDao.saveIngredientJoinItemResturant(ingredientJoinItemResturan);
		
		ItemOption itemOption=itemOptionDao.getItemOptionById(Integer.parseInt(itemFrom.getItemOptionId()),"itemOptionId");
		
		
		OptionJoinItemId optionJoinItemId=new OptionJoinItemId();
		
		optionJoinItemId.setItemJoinStoreId(itemJoinStoreId);
		optionJoinItemId.setItemOptionId(itemOption.getItemOptionId());
		OptionJoinItem optionJoinItem=new OptionJoinItem();
		optionJoinItem.setPrice(Double.parseDouble(itemFrom.getPrice()));
		optionJoinItem.setId(optionJoinItemId);
		
		optionJoinItemDao.saveOptionJoinItem(optionJoinItem);
		
		
		
		}
}
