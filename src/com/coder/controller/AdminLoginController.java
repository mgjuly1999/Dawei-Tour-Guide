package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.ItemForm;
import com.coder.form.ItemRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.service.AdminLoginService;
import com.coder.service.AdminRegisterServic;
import com.coder.service.UserRegisterService;

@Controller
@Transactional
public class AdminLoginController {
	@Autowired
	private AdminLoginService adminLoginService;
	@RequestMapping("/")
	public String TypeRegisterDispatcher(ModelMap modelMap)
	{   
		modelMap.addAttribute("adminForm",new AdminForm());
		return "Adminlogin";
	}
	
	@RequestMapping("/adminLoginSubmit")
	public String userRegisterSubmitDispatcher(@ModelAttribute("AdminForm") AdminForm adminForm,ModelMap modelMap)
	{
		AdminRegisterForm adminRegisterForm=new AdminRegisterForm();
		adminRegisterForm.setAdminForm(adminForm);
		adminLoginService.adminLoginPrepare(adminRegisterForm);
		if(adminRegisterForm.getAdmin()!=null)
		{
			return "home";
		}else
		{
			modelMap.addAttribute("adminForm",new AdminForm());
			return "Adminlogin";
		}
	
	}
}
