package com.tka.basic;

import com.tka.config.Config;

public class WindowMain extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WindowMain obj=new WindowMain();
		obj.browserSetting("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		obj.login();
		obj.dashboard();

	}

}
