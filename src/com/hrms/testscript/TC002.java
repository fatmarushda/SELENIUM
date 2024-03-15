package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002 {
 @Test
 public void tc002() {
	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	 DOMConfigurator.configure("log4j.xml");
General gn=new General();
gn.openApplication();
gn.login();
gn.enterFrame();
gn.addNewEmp();
gn.exitFrame();
gn.logout();
gn.closeApplication();
	}
}

