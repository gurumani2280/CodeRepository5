package com.pack1;

import org.testng.annotations.DataProvider;

public class Static_Data_Provider1 {
	
	@DataProvider(name = "data")
	public static Object[][] getData() {
		return new Object[][] { { "data1"}, { "data2" }, { "data3" } };
	}

}
