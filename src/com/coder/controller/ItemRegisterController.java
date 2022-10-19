package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.ItemForm;
import com.coder.form.ItemRegisterForm;
import com.coder.form.TypeForm;
import com.coder.form.TypeRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.service.ItemRegisterServic;
import com.coder.service.TypeRegisterServic;
import com.coder.service.UserRegisterService;

@Controller
@Transactional
public class ItemRegisterController {
	@Autowired
	private ItemRegisterServic itemRegisterServic;
	@RequestMapping("/itemRegisterPath")
	public String TypeRegisterDispatcher(ModelMap modelMap)
	{   
		ItemRegisterForm myForm=new ItemRegisterForm();
		itemRegisterServic.prepareItemRegister(myForm);
		modelMap.addAttribute("itemForm",new ItemForm());
		modelMap.addAttribute("itemRegisterForm",myForm);
		return "ItemRegister";
	}
	
	@RequestMapping("/itemRegisterSubmit")
	public String TypeRegisterSubmitDispatcher(@ModelAttribute("itemForm") ItemForm myItemForm,ModelMap modelMap)
	{
		ItemRegisterForm myForm=new ItemRegisterForm();
		myForm.setItemForm(myItemForm);
		
		itemRegisterServic.prepareItemRegister(myForm);
		modelMap.addAttribute("itemRegisterForm",myForm);
		modelMap.addAttribute("itemForm",new ItemForm());
		return "ItemRegister";
	}
}
