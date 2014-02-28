package com.spring.webflow.services;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.webflow.domain.ShadowUser;


public class ShadowServiceImpl implements ShadowService {
	

	@Autowired
    SqlSession session;
	
	public ShadowServiceImpl(){

	}
	
	public List<ShadowUser> getAllUsers(){
		List<ShadowUser> userList = session.selectList("selectAllShadowUsers");
		return userList;		
	}
	
	public boolean performCreateUser(ShadowUser shadowuser){
		try{
			HashMap<String, Object> userObj = new HashMap<String, Object>(); 
			userObj.put("firstName", shadowuser.getFirstName());
			userObj.put("lastName", shadowuser.getLastName());
			userObj.put("age", shadowuser.getAge());
			userObj.put("status", true);
			session.insert("createUser", userObj);
			return true;			
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean deleteUser(int userId){
		try{
			session.update("deleteUser", userId);				
			return true;
		}catch(Exception e){
			return false;
		}		
	}
	
	public boolean performUpdateUser(ShadowUser shadowuser){		
		try{
			HashMap<String, Object> userObj = new HashMap<String, Object>(); 
			userObj.put("id", shadowuser.getId());
			userObj.put("firstName", shadowuser.getFirstName());
			userObj.put("lastName", shadowuser.getLastName());
			userObj.put("age", shadowuser.getAge());
			session.update("updateUser",userObj);
			return true;			
		}catch(Exception e){
			return false;
		}
	}
	
	
	public ShadowUser findOneUser(int userId){			
		ShadowUser userToUpdate = session.selectOne("findOneUser", userId);		
		return userToUpdate;
	} 
	
	
	
}
