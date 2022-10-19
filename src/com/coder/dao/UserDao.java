package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.User;



@Repository("userDoa")
public class UserDao extends AbstractDao<Integer,User>{
	
	public Integer saveUser(User user)
	{
		
	return (Integer)super.persist(user);
		

		}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}



}
