package com.spring.webflow.services;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.webflow.domain.Logincredential;

public class LoginServiceImpl implements LoginService {
	

	@Autowired
    SqlSession session;
	
	private Logincredential logins;
	
	public LoginServiceImpl(){

	}
	
	public String getCredentials(Logincredential login) {						
		try{
			//LogincredentialMapper loginMapper = session.getMapper(LogincredentialMapper.class);
			//Logincredential loginCredential = loginMapper.getLogincredentialByUsernameAndPassword(username, password);
			HashMap<String, Object> loginObj = new HashMap<String, Object>(); 
			loginObj.put("username", login.getLoginname());
			loginObj.put("password", login.getPassword());
			
			System.out.println(login.getLoginname() + login.getPassword());
			
			List<Logincredential> logins = session.selectList("getLogincredentials", loginObj);
			System.out.println("COUNt:" + logins.size() +"username:" + logins.get(0).getLoginname());
					
			if(logins.size() == 1){
				return "Valid";
			}else
				return "Invalid";
		}catch(Exception e){
			return "Invalid";
		}
				
	}


}
