package main;

import service.imp.TestServiceImpService;


public class WSClient {
	
	public static void main(String[] args) {
		TestServiceImpService test = new TestServiceImpService();
		String name = test.getTestServiceImpPort().sayHello("123213");
		System.out.println(name);
	}

}
