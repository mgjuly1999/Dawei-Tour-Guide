package com.coder.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coder.dao.AddressDao;
import com.coder.dao.AdminDao;
import com.coder.dao.DayDao;
import com.coder.dao.LanguageDao;
import com.coder.dao.LinkJoinShopDao;
import com.coder.dao.LinkTypeDao;
import com.coder.dao.ShopDao;
import com.coder.dao.ShopJoinLanguageDao;
import com.coder.dao.ShopMediaDao;
import com.coder.dao.TimeTableDao;
import com.coder.dao.UserDao;
import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.ShopForm;
import com.coder.form.ShopRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.model.Address;
import com.coder.model.Admin;
import com.coder.model.Day;
import com.coder.model.ItemOption;
import com.coder.model.Language;
import com.coder.model.LinkJoinShop;
import com.coder.model.LinkJoinShopId;
import com.coder.model.LinkType;
import com.coder.model.Shop;
import com.coder.model.ShopJoinLanguage;
import com.coder.model.ShopJoinLanguageId;
import com.coder.model.ShopMedia;
import com.coder.model.TimeTable;
import com.coder.model.TimeTableId;
import com.coder.model.Type;
import com.coder.model.User;
import com.coder.util.DateFormat;

import sun.awt.image.ImageWatched.Link;

@Service
@Repository("shopRegisterServic")
public class ShopRegisterServic {
	@Autowired
	private ShopMediaDao shopMediaDao;
	@Autowired
	private ShopJoinLanguageDao shopJoinLanguageDao;
	@Autowired
	private LanguageDao languageDao;
	@Autowired
	private LinkTypeDao linkTypeDao;
	@Autowired
	private DayDao dayDao;
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private ShopDao shopDao;
	@Autowired
	private LinkJoinShopDao linkJoinShopDao;
	@Autowired
	private TimeTableDao  timeTableDao;
	@Autowired
	private AddressDao addressDao;
	public void prepareShopRegister(ShopRegisterForm myFrom)
	{
		if(myFrom.getShopForm()!=null)
		{
			this.ShopRegister(myFrom);
		}
	myFrom.setShops(shopDao.getShops());
	List<LinkType> linkTypes=this.linkTypeDao.getLinkTypes();
	for( LinkType o:linkTypes){
	myFrom.getMapLinkTypes().put(""+o.getLinkTypeId(),o.getLinkTypeName())	;
	}
	}
	
	public void ShopRegister(ShopRegisterForm myFrom)
	{   Language language=new Language();
		Admin admin=new Admin();
	    Address address=new Address();
		Shop shop=new Shop();
		ShopForm	shopForm=myFrom.getShopForm();
		Day day=new Day();
        LinkType linkType=new LinkType();
        LinkJoinShop linkJoinShop=new LinkJoinShop();
        ShopJoinLanguage shopJoinLanguage=new ShopJoinLanguage();
        ShopMedia  shopMedia=new ShopMedia();
        
        admin=adminDao.getAdminById(1);
        
        day=dayDao.getDayById(1,"dayId");
       
        
        shop.setAdmin(admin);
        shop.setName(shopForm.getName());
        shop.setCreateDate(new Date());
        admin.getShops().add(shop);
        
        linkType=linkTypeDao.getLinkTypeById(1,"linkTypeId");
       
        linkJoinShop.setLinkType(linkType);
        linkJoinShop.setLink(shopForm.getLink());
        
       
        language=languageDao.getLanguageById(1,"languageId");
       
        shopJoinLanguage.setAboutUs(shopForm.getAboutUs());
        shopJoinLanguage.setName(shopForm.getName());
        shopJoinLanguage.setDescription(shopForm.getDescription());
        
        address.setStreet(shopForm.getStreet());
        address.setCity(shopForm.getCity());
        address.setFullAddress(shopForm.getFullAddress());
        address.setPostalCode(shopForm.getPostalCode());
        address.setQuarter(shopForm.getQuarter());
        address.setLat(Double.parseDouble(shopForm.getLat()));
        address.setLaung(Double.parseDouble(shopForm.getLaung()));
        address.setPhone(shopForm.getPhone());
     
       shopMedia.setMediaName("media name");
       shopMedia.setMediaType(shopForm.getMediaType());
       
       shop.getShopMedias().add(shopMedia);
       shopMedia.setShop(shop);
        
        Set<Address> addresss=new HashSet<Address>();
        addresss.add(address);
        shop.setAddresses(addresss);
;       address.setShop(shop);
      
      shop.setShopId(shopDao.saveShop(shop));
      
      LinkJoinShopId linkJoinShopId=new LinkJoinShopId();
      linkJoinShopId.setLinkTypeId(linkType.getLinkTypeId());
      linkJoinShopId.setShopId(shop.getShopId());
      linkJoinShop.setId(linkJoinShopId);
      
      linkJoinShopDao.saveLinkJoinShop(linkJoinShop);
      
      ShopJoinLanguageId shopJoinLanguageId=new ShopJoinLanguageId();
      shopJoinLanguageId.setLanguageId(language.getLanguageId());
      shopJoinLanguageId.setShopId(shop.getShopId());
      shopJoinLanguage.setId(shopJoinLanguageId);
      
      shopJoinLanguageDao.saveShopJoinLanguage(shopJoinLanguage);
      
     }
}
