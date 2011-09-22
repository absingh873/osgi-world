package com.chandana.hello.service.impl;

import com.chandana.hello.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String helloMethods() {
		String retValue = "Inside Hello Service method";
		return retValue;
	}

}
