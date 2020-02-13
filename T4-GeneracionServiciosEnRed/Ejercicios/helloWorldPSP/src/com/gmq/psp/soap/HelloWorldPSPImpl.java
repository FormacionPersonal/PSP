package com.gmq.psp.soap;

public class HelloWorldPSPImpl implements HelloWorldPSP {

	@Override
	public String hello(String name) {
		return "Hello, "+name;
	}

}
