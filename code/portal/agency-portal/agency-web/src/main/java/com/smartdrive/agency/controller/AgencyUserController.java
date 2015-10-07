package com.smartdrive.agency.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartdrive.common.controller.BaseController;

@Controller
public class AgencyUserController extends BaseController{

	@RequestMapping
	public String getHomePage(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
		return "agencyhome";
	}
	
	
	
}
