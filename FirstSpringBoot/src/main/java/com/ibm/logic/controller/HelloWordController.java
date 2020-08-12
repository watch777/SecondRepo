package com.ibm.logic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

 @RequestMapping(value="/")	
  public String sayHello()
  {
	  return "Welcome to Rest Controller";
  }

}

