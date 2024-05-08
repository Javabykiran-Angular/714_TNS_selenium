package com.tka.locators;

import com.tka.config.Config;

public class LocatorsMain extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocatorsMain obj=new LocatorsMain();
		
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.elementAccess();

	}

}
