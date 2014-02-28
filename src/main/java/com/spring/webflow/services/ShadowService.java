package com.spring.webflow.services;


import java.util.List;

import com.spring.webflow.domain.ShadowUser;


public interface ShadowService {
		
	public List<ShadowUser> getAllUsers();
	
	public boolean performCreateUser(ShadowUser shadowuser);

	public boolean deleteUser(int userId);

	public boolean performUpdateUser(ShadowUser shadowuser);
	
	public ShadowUser findOneUser(int userId);
	
}