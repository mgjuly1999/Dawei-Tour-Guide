package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.ShopForm;
import com.coder.form.ShopRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.service.ShopRegisterServic;
import com.coder.service.UserRegisterService;


@Controller
@Transactional
public class ShopRegisterController {
	@Autowired
	private ShopRegisterServic shopRegisterServic;
	@RequestMapping("/shopRegisterPath")
	public String ShopRegisterDispatcher(ModelMap modelMap)
	{
		ShopRegisterForm myForm=new ShopRegisterForm();
		shopRegisterServic.prepareShopRegister(myForm);
		modelMap.addAttribute("shopForm",new ShopForm());
		modelMap.addAttribute("shopRegisterForm",myForm);
		return "ShopRegister";
	}
	
	@RequestMapping("/shopRegisterSubmit")
	public String ShopRegisterSubmitDispatcher(@ModelAttribute("shopForm") ShopForm myShopForm,ModelMap modelMap)
	{
		ShopRegisterForm myForm=new ShopRegisterForm();
		myForm.setShopForm(myShopForm);
		
		shopRegisterServic.prepareShopRegister(myForm);
		modelMap.addAttribute("shopRegisterForm",myForm);
		modelMap.addAttribute("shopForm",new ShopForm());
		return "ShopRegister";
	}
}
