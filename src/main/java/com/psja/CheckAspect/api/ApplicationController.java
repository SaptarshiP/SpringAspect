package com.psja.CheckAspect.api;

import org.springframework.web.bind.annotation.RestController;

import com.psja.CheckAspect.service.ApplicationServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ApplicationController {

	@Autowired
	private ApplicationServiceImpl applicationServiceImpl;
	
	@RequestMapping(value="/getData")
	public void getData() {
		applicationServiceImpl.getDataService("test");
		System.out.println("in getData");
	}
	
}
