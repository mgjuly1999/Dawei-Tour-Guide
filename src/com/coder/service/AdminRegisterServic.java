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
@Repository("adminRegisterServic")
public class AdminRegisterServic {
	
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private AdminRoleDao adminRoleDao;
	public void prepareAdminRegister(AdminRegisterForm myFrom)
	{
		if(myFrom.getAdminForm()!=null)
		{
			this.AdminRegister(myFrom);
		}
	myFrom.setAdmins(adminDao.getAdmins());
	List<AdminRole> adminRoles=this.adminRoleDao.getAdminRoles();
	for( AdminRole s:adminRoles){
	myFrom.getMapAdminRoles().put(""+s.getRoleId(),s.getRoleName())	;
	}
		
	}
	public void AdminRegister(AdminRegisterForm myFrom)
	{
		Admin admin=new Admin();
		AdminForm	adminForm=myFrom.getAdminForm();
        AdminRole adminRole=this.adminRoleDao.getAdminById(adminForm.getRoleId(),"roleId");
        
	    
		admin.setName(adminForm.getName());
		admin.setEmail(adminForm.getEmail());
		admin.setPassword(adminForm.getPassword());
		admin.setPhone(adminForm.getPhone());
		admin.setStatus((adminForm.getStatus()));
		
		admin.getAdminRoles().add(adminRole);
		adminRole.getAdmins().add(admin);
		
		admin.setAdminId(adminDao.saveAdmin(admin));
		
		
		
		 String serverPath=ServerPath.getPath();
		  String adminPath=ServerPath.createFloder(serverPath+File.separator+"admin");
		
	  		    
           for (MultipartFile multipartFile : myFrom.getAdminForm().getImageFiles()) {
           	String extension = FilenameUtils.getExtension(multipartFile.getOriginalFilename());
           	String fileName=admin.getAdminId()+"";
 
           		String url=adminPath+File.separator+fileName+"."+extension;
           	
           		FileUpload.uploadFile(multipartFile,url);
              
           }
		
		
		

		
	}
}
