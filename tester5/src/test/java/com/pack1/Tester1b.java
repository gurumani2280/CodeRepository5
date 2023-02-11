package com.pack1;

  
import org.testng.annotations.Test;

public class Tester1b {

	@Test(dataProviderClass = Static_Data_Provider1.class, dataProvider = "data")
	public void test1(String cloumn1) {
		System.out.println("test");
		System.out.println(cloumn1);
	}

}


