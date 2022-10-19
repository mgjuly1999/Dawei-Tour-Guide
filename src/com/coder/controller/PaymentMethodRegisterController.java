package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.FoodGroupForm;
import com.coder.form.FoodGroupRegisterForm;
import com.coder.form.PaymentMethodForm;
import com.coder.form.PaymentMethodRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.model.FoodGroup;
import com.coder.service.FoodGroupRegisterServic;
import com.coder.service.PaymentMethodRegisterServic;
import com.coder.service.UserRegisterService;

@Controller
@Transactional
public class PaymentMethodRegisterController {
	@Autowired
	private PaymentMethodRegisterServic paymentMethodRegisterServic;
	@RequestMapping("/paymentMethodPath")
	public String PaymentMethodRegisterDispatcher(ModelMap modelMap)
	{
		PaymentMethodRegisterForm myForm=new PaymentMethodRegisterForm();
		paymentMethodRegisterServic.preparePaymentMethodRegister(myForm);
		modelMap.addAttribute("paymentMethodForm",new PaymentMethodForm());
		modelMap.addAttribute("paymentMethodRegisterForm",myForm);
		return "PaymentMethodRegister";
	}
	
	@RequestMapping("/paymentMethodRegisterSubmit")
	public String PaymentMethodRegisterSubmitDispatcher(@ModelAttribute("paymentMethodForm") PaymentMethodForm myPaymentMethodForm,ModelMap modelMap)
	{
		System.out.println("Payment Mehtod Register Submit");
		PaymentMethodRegisterForm myForm=new PaymentMethodRegisterForm();
		myForm.setPaymentMethodForm(myPaymentMethodForm);
		
		paymentMethodRegisterServic.preparePaymentMethodRegister(myForm);
		modelMap.addAttribute("paymentMethodRegisterForm",myForm);
		modelMap.addAttribute("paymentMethodForm",new PaymentMethodForm());
		return "PaymentMethodRegister";
	}
}
