package com.mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
	String path="./Configuration/config.properties";
	
	//Constructor
	public ReadConfig()
	{
		try {
			properties=new Properties();
			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//reading values from config file
	
	public String getBaseUrl()
	{
		String value = properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("url value not present inside config file");
		
	}
	
	public String getBrowser()
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser value not present inside config file");
		
	}
	
}