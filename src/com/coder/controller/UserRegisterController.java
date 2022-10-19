package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.service.UserRegisterService;


@Controller
@Transactional
public class UserRegisterController {
	@Autowired
	private UserRegisterService userRegisterService;
	@RequestMapping("/userRegisterPath")
	public String userRegisterDispatcher(ModelMap modelMap)
	{
		UserRegisterForm myForm=new UserRegisterForm();
		userRegisterService.prepareUserRegister(myForm);
		modelMap.addAttribute("userForm",new UserForm());
		modelMap.addAttribute("userRegisterForm",myForm);
		return "UserRegister";
	}
	
	@RequestMapping("/userRegisterSubmit")
	public String userRegisterSubmitDispatcher(@ModelAttribute("userForm") UserForm myUserForm,ModelMap modelMap)
	{
		UserRegisterForm myForm=new UserRegisterForm();
		myForm.setUserForm(myUserForm);
		
		userRegisterService.prepareUserRegister(myForm);
		modelMap.addAttribute("userRegisterForm",myForm);
		modelMap.addAttribute("userForm",new UserForm());
		return "UserRegister";
	}
}
