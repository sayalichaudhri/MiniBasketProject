package com.etsyframework.FileUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.etsyframework.Keywords.Constants;


public class Readconfig {

	public Readconfig() {
		try {
			Constants.fin = new FileInputStream("./configFile/config.properties");
			Constants.prop = new Properties();
			Constants.prop.load(Constants.fin);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String getUsername()
	{
		String uname=Constants.prop.getProperty("url");
		return uname;
	}
	
	public static String getPassword()
	{
		String pass=Constants.prop.getProperty("pass");
		return pass;
	}
}
