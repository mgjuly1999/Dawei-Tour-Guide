package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.service.AdminRegisterServic;
import com.coder.service.UserRegisterService;

@Controller
@Transactional
public class AdminRegisterController {
	@Autowired
	private AdminRegisterServic adminRegisterServic;
	@RequestMapping("/adminRegisterPath")
	public String AdminRegisterDispatcher(ModelMap modelMap)
	{
		AdminRegisterForm myForm=new AdminRegisterForm();
		adminRegisterServic.prepareAdminRegister(myForm);
		modelMap.addAttribute("adminForm",new AdminForm());
		modelMap.addAttribute("adminRegisterForm",myForm);
		return "AdminRegister";
	}
	
	@RequestMapping("/AdminRegisterSubmit")
	public String userRegisterSubmitDispatcher(@ModelAttribute("AdminForm") AdminForm myAdminForm,ModelMap modelMap)
	{
		AdminRegisterForm myForm=new AdminRegisterForm();
		myForm.setAdminForm(myAdminForm);
		adminRegisterServic.prepareAdminRegister(myForm);
		modelMap.addAttribute("adminRegisterForm",myForm);
		modelMap.addAttribute("adminForm",new AdminForm());
		return "AdminRegister";
	}
}
