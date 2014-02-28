package com.spring.webflow.webactions;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.webflow.action.MultiAction;
import org.springframework.webflow.execution.RequestContext;

import com.spring.webflow.domain.Logincredential;
import com.spring.webflow.domain.ShadowUser;
import com.spring.webflow.services.LoginService;
import com.spring.webflow.services.ShadowService;

public class ShadowAction
    extends MultiAction
    implements InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(ShadowAction.class);

    @Autowired
    SqlSession session;
    
	@Autowired
	private LoginService loginService;	
	
	@Autowired
	private ShadowService shadowService;	
 
    public String loginCredentials(Logincredential login, RequestContext requestContext){
    	if(loginService.getCredentials(login) == "Valid")
    		return "success";
    	else{
    		requestContext.getFlashScope().put("messageInfo", "Username or password is incorrect.");
    		return "error";
    	}
    }
    
    public List<ShadowUser> viewUsers(RequestContext requestContext){
    	List<ShadowUser> users = shadowService.getAllUsers();   
    	requestContext.getFlashScope().put("users", users);
		return users;
    }
    
    public String createUser(ShadowUser shadowuser, RequestContext requestContext) {
    	requestContext.getFlashScope().put("buttonAction", "Create");
		requestContext.getFlashScope().put("actionEventId", "createUserForm");
		
		if(shadowService.performCreateUser(shadowuser)){
			requestContext.getFlashScope().put("messageInfo", "User created.");
			return "success";
		}else{
			requestContext.getFlashScope().put("messageInfo", "An error occured.");
			return "error";
		}
    }
        
    public String userAction(String userAction, int userId, RequestContext requestContext){    	
    	if(userAction.equals("update")){
    		requestContext.getFlashScope().put("buttonAction", "Update");
    		requestContext.getFlashScope().put("actionEventId", "updateUserForm");
    		
    		ShadowUser users = shadowService.findOneUser(userId);  	
        	requestContext.getFlashScope().put("user", users);
    	}else{
    		requestContext.getFlashScope().put("buttonAction", "Create");
    		requestContext.getFlashScope().put("actionEventId", "createUserForm");
    	}    	
    	return "success";
    }
    
    public List<ShadowUser> deleteUserAction(int userId, RequestContext requestContext){
    	if(!shadowService.deleteUser(userId))
    		requestContext.getFlashScope().put("messageInfo", "An error occured.");    		
    	List<ShadowUser> users = shadowService.getAllUsers();   
    	requestContext.getFlashScope().put("users", users);
		return users;
    }
    
    public String updateUser(ShadowUser shadowuser, RequestContext requestContext) {
    	requestContext.getFlashScope().put("buttonAction", "Create");
		requestContext.getFlashScope().put("actionEventId", "createUserForm");
		
		System.out.println("VALUE:" + shadowuser.getFirstName());
		
		if(shadowService.performUpdateUser(shadowuser)){
			requestContext.getFlashScope().put("messageInfo", "User updated.");
			return "success";
		}else{
			requestContext.getFlashScope().put("messageInfo", "An error occured.");
			return "error";
		}
    }
    
    
    
    

}
