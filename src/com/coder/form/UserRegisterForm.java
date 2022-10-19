package com.coder.form;

import java.util.List;

import com.coder.model.User;

public class UserRegisterForm {
private UserForm userForm=null;
private User user;
private List<User> users;

public UserForm getUserForm() {
	return userForm;
}

public void setUserForm(UserForm userForm) {
	this.userForm = userForm;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public List<User> getUsers() {
	return users;
}

public void setUsers(List<User> users) {
	this.users = users;
}
}
