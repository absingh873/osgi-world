package com.chandana.hello.helloservice;

public class HelloServiceImpl implements HelloService {

	@Override
	public String helloMethods() {
		String retValue = "Inside Hello Service method";
		return retValue;
	}

}
