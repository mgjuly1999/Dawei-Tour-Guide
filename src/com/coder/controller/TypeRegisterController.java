package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.TypeForm;
import com.coder.form.TypeRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.service.TypeRegisterServic;
import com.coder.service.UserRegisterService;

@Controller
@Transactional
public class TypeRegisterController {
	@Autowired
	private TypeRegisterServic typeRegisterServic;
	@RequestMapping("/typeRegisterPath")
	public String TypeRegisterDispatcher(ModelMap modelMap)
	{   
		TypeRegisterForm myForm=new TypeRegisterForm();
		typeRegisterServic.prepareTypeRegister(myForm);
		modelMap.addAttribute("typeForm",new TypeForm());
		modelMap.addAttribute("typeRegisterForm",myForm);
		return "TypeRegister";
	}
	
	@RequestMapping("/typeRegisterSubmit")
	public String TypeRegisterSubmitDispatcher(@ModelAttribute("typeForm") TypeForm myTypeForm,ModelMap modelMap)
	{
		TypeRegisterForm myForm=new TypeRegisterForm();
		myForm.setTypeForm(myTypeForm);
		
		typeRegisterServic.prepareTypeRegister(myForm);
		modelMap.addAttribute("typeRegisterForm",myForm);
		modelMap.addAttribute("typeForm",new TypeForm());
		return "TypeRegister";
	}
}
