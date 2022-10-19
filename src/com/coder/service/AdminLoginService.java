package com.coder.service;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.coder.dao.AdminDao;
import com.coder.dao.AdminRoleDao;

import com.coder.dao.UserDao;
import com.coder.form.AdminForm;
import com.coder.form.AdminRegisterForm;
import com.coder.form.UserForm;
import com.coder.form.UserRegisterForm;
import com.coder.model.Admin;
import com.coder.model.AdminRole;
import com.coder.model.Type;
import com.coder.model.User;
import com.coder.util.FileUpload;
import com.coder.util.ServerPath;

@Service
@Repository("adminLoginService")
public class AdminLoginService {
	
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private AdminRoleDao adminRoleDao;
	
		
	
	public void adminLoginPrepare(AdminRegisterForm adminRegisterForm)
	{    String path="";
		Admin admin=new Admin();
		AdminForm	adminForm=adminRegisterForm.getAdminForm();
		
       	admin.setEmail(adminForm.getEmail());
		admin.setPassword(adminForm.getPassword());
		
		admin=adminDao.adminLogin(admin);
		adminRegisterForm.setAdmin(admin);
		
		
	}
}
