package com.tka.main;

import com.tka.config.Config;

public class MainClass extends Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass obj=new MainClass();
		obj.browserSetting("https://register.rediff.com/register/register.php?FormName=user_details");
		//obj.scrollBarWindow();
		obj.accessScrollBarWebElement();
		

	}

}
