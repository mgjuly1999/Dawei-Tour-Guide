package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;


@Repository("adminDoa")
public class AdminDao extends AbstractDao<Integer,Admin>{
	
	public Integer saveAdmin(Admin admin)
	{
	return (Integer)super.persist(admin);
	}
public void  updateAdmin(Admin admin)
{
super.merge(admin);

}

public Admin getAdminById(int id){
	Admin admin=super.criteriaQuerryGetObjectById(id,"adminId");
	return admin;
	}

public List<Admin> getAdmins() {
List<Admin> admins=(List<Admin>)super.criteriaQuerry();
	return admins;
}

public Admin adminLogin(Admin admin){
	admin=super.getObjectTwoParam(admin.getPassword(),"password",admin.getEmail(),"email");
	return admin;
	
}




}
