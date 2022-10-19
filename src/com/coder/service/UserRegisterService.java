package com.coder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coder.dao.UserDao;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.model.User;

@Service
@Repository("userRegisterService")
public class UserRegisterService {
	@Autowired
	private UserDao userDao;
	public void prepareUserRegister(UserRegisterForm myFrom)
	{
		if(myFrom.getUserForm()!=null)
		{
			this.userRegister(myFrom);
		}
	myFrom.setUsers(userDao.getUsers());
	
		
	}
	public void userRegister(UserRegisterForm myFrom)
	{
		User user=new User();
		UserForm	userForm=myFrom.getUserForm();
		
		user.setName(userForm.getName());
		user.setLastName(userForm.getLastName());
		user.setEmail(userForm.getEmail());
		user.setPassword(userForm.getPassword());
		user.setStatus(userForm.getStatus());	
		System.out.println("id="+userDao.saveUser(user));
		
	}
}
