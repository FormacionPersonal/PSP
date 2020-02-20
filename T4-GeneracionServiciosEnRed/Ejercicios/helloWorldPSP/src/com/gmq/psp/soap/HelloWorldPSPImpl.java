package com.gmq.psp.soap;

public class HelloWorldPSPImpl implements HelloWorldPSP {

	@Override
	public String goodbye(String name, String procedence) {
		
		return "Goodbye, "+name+" from "+procedence;
	}

	@Override
	public String hello(String name) {
		return "Hello, "+name;
	}

}
