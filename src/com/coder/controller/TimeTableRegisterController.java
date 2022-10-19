package com.coder.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coder.form.TimeTableForm;
import com.coder.form.TimeTableRegisterForm;
import com.coder.form.TypeForm;
import com.coder.form.TypeRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.service.TimeTableRegisterServic;
import com.coder.service.TypeRegisterServic;
import com.coder.service.UserRegisterService;

@Controller
@Transactional
public class TimeTableRegisterController {
	@Autowired
	private TimeTableRegisterServic timeTableRegisterServic;
	@RequestMapping("/timeTableRegisterPath")
	public String TypeRegisterDispatcher(ModelMap modelMap)
	{   
		TimeTableRegisterForm myForm=new TimeTableRegisterForm();
		timeTableRegisterServic.prepareTimeTableRegister(myForm);
		modelMap.addAttribute("timeTableForm",new TimeTableForm());
		modelMap.addAttribute("timeTableRegisterForm",myForm);
		return "TimeTableRegister";
	}
	
	@RequestMapping("/timeTableRegisterSubmit")
	public String TimeTableRegisterSubmitDispatcher(@ModelAttribute("timeTableForm") TimeTableForm myTimeTableForm,ModelMap modelMap)
	{
		TimeTableRegisterForm myForm=new TimeTableRegisterForm();
		myForm.setTimeTableForm(myTimeTableForm);
		System.out.println("Arriving Register submit");
		timeTableRegisterServic.prepareTimeTableRegister(myForm);
		modelMap.addAttribute("timeTableRegisterForm",myForm);
		modelMap.addAttribute("timeTableForm",new TimeTableForm());
		return "TimeTableRegister";
	}
}
