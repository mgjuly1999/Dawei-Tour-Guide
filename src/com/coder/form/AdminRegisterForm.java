package com.coder.form;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import com.coder.model.Admin;
import com.coder.model.User;

public class AdminRegisterForm {
	private AdminForm adminForm=null;
	private Admin admin;
	private List<Admin> admins;
	private Map<String,String> mapAdminRoles=new HashedMap<String,String>();
	public AdminForm getAdminForm() {
		return adminForm;
	}
	public void setAdminForm(AdminForm adminForm) {
		this.adminForm = adminForm;
	}
	public Admin getAdmin() {
		return admin;
	}
	public Map<String, String> getMapAdminRoles() {
		return mapAdminRoles;
	}
	public void setMapAdminRoles(Map<String, String> mapAdminRoles) {
		this.mapAdminRoles = mapAdminRoles;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public List<Admin> getAdmins() {
		return admins;
	}
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
}
