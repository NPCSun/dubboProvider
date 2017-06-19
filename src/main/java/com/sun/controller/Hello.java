package com.sun.controller;

import com.sun.service.AService;
import com.sun.service.BService;
import com.sun.util.ApplicationContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Hello {


	@Resource(name="aService")
	private AService aServiceDubbo;
	
	@Resource(name="bService")
	private BService bServiceDubbo;
	
    @RequestMapping("/")
    public String greeting() {
    	AService as = (AService) ApplicationContextHolder.getBean("aService");
    	as.sayHi("sun");
    	BService bs = (BService) ApplicationContextHolder.getBean("bService");
    	bs.sayHi("sun");
        return "";
    }

}