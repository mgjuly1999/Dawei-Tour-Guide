package com.coder.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.AdminRole;


@Repository("adminRoleDao")
public class AdminRoleDao extends AbstractDao<Integer,AdminRole>{
	
	public Integer saveAdminRole(AdminRole adminRole)
	{
	return (Integer)super.persist(adminRole);

		}


public void  updateAdmin(AdminRole admin)
{
super.merge(admin);

}

public AdminRole getAdminById(int id,String strId){
	AdminRole adminRole=super.criteriaQuerryGetObjectById(id, strId);
	return adminRole;
	}

public List<AdminRole> getAdminRoles() {
List<AdminRole> adminRoles=(List<AdminRole>)super.criteriaQuerry();
	return adminRoles;
}






}
