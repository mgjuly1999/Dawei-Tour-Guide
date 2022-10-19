package com.coder.form;

import org.springframework.web.multipart.MultipartFile;

public class AdminForm {
    
	private Integer adminId;
	private String name;
	private String email;
	private String password;
	private String phone;
	private String status;
	private Integer roleId;
	private MultipartFile[] imageFiles;
	
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public MultipartFile[] getImageFiles() {
		return imageFiles;
	}
	public void setImageFiles(MultipartFile[] imageFiles) {
		this.imageFiles = imageFiles;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
