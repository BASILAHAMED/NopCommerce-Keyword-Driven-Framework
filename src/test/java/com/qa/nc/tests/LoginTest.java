package com.qa.nc.tests;

import org.testng.annotations.Test;

import com.qa.nc.keyword.engine.KeyWordEngine;
/**
 * 
 * @author BasilAhamed
 *
 */
public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
	
	@Test
	public void signUpTest(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("signup");
	}
	
	
	

}
