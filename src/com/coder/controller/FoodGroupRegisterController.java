package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.FoodGroupForm;
import com.coder.form.FoodGroupRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.model.FoodGroup;
import com.coder.service.FoodGroupRegisterServic;
import com.coder.service.UserRegisterService;


@Controller
@Transactional
public class FoodGroupRegisterController {
	@Autowired
	private FoodGroupRegisterServic foodGroupRegisterService;
	@RequestMapping("/foodGroupRegisterPath")
	public String FoodGroupRegisterDispatcher(ModelMap modelMap)
	{
		FoodGroupRegisterForm myForm=new FoodGroupRegisterForm();
		foodGroupRegisterService.prepareFoodGroupRegister(myForm);
		modelMap.addAttribute("foodGroupForm",new FoodGroupForm());
		modelMap.addAttribute("foodGroupRegisterForm",myForm);
		return "FoodGroupRegister";
	}
	
	@RequestMapping("/FoodGroupRegisterSubmit")
	public String FoodGroupRegisterSubmitDispatcher(@ModelAttribute("foodGroupForm") FoodGroupForm myFoodGroupForm,ModelMap modelMap)
	{
		FoodGroupRegisterForm myForm=new FoodGroupRegisterForm();
		myForm.setFoodGroupForm(myFoodGroupForm);
	
		foodGroupRegisterService.prepareFoodGroupRegister(myForm);
		
		modelMap.addAttribute("foodGroupRegisterForm",myForm);
		modelMap.addAttribute("foodGroupForm",new FoodGroupForm());
		return "FoodGroupRegister";
	}
}
