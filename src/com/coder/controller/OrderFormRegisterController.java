package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.OrderFormForm;
import com.coder.form.OrderFormRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.service.AdminRegisterServic;
import com.coder.service.OrderFormRegisterServic;
import com.coder.service.UserRegisterService;

@Controller
@Transactional
public class OrderFormRegisterController {
	@Autowired
	private OrderFormRegisterServic orderFormRegisterService;
	@RequestMapping("/orderFormRegisterPath")
	public String AdminRegisterDispatcher(ModelMap modelMap)
	{
		OrderFormRegisterForm myForm=new OrderFormRegisterForm();
		orderFormRegisterService.prepareOrderFormRegister(myForm);
		modelMap.addAttribute("orderFormForm",new OrderFormForm());
		modelMap.addAttribute("orderFormRegisterForm",myForm);
		return "OrderFormRegister";
	}
	
	@RequestMapping("/OrderFormRegisterSubmit")
	public String OrderFormrRegisterSubmitDispatcher(@ModelAttribute("OrderFormForm") OrderFormForm myOrderFormForm,ModelMap modelMap)
	{
		System.out.println("Arriving Order Form submit");
		OrderFormRegisterForm myForm=new OrderFormRegisterForm();
		myForm.setOrderFormForm(myOrderFormForm);
		orderFormRegisterService.prepareOrderFormRegister(myForm);
		modelMap.addAttribute("orderFormRegisterForm",myForm);
		modelMap.addAttribute("orderFormForm",new OrderFormForm());
		return "OrderFormRegister";
	}
}
