package com.psja.CheckAspect.service;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl {

	public void getDataService(String b) {
		System.out.println("In getDataService");
		checkInternalMethod();
		//String a = null;
		//System.out.println(a.toLowerCase());
		
	}
	
	public void checkInternalMethod() {
		System.out.println("I am here");
	}
}
