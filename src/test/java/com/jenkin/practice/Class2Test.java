package com.jenkin.practice;

import org.testng.annotations.Test;

public class Class2Test {
	@Test
	public void class2Test()
	{
		String browser = System.getProperty("Browser");
		System.out.println(browser);
		String url = System.getProperty("Url");
		System.out.println(url);
		System.out.println("class2 running");
		System.out.println("class2 again running");
		//commit1
	}

}
