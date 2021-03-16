package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	/*
	 * This methods will used to load the properties from config,peoperties file 
	 * @return Properties prop object
	 */
	public Properties init_prop()
	{
		prop = new Properties();
		try {
			FileInputStream fip = new FileInputStream("./src/resource/java/config/config.properties");
			prop.load(fip);
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
}
