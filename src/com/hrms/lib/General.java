package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.hrms.utility.Log;
//import org.openqa.selenium.chrome.ChromeDriver;
public class General extends Global {
	public void openApplication() {
		driver=new EdgeDriver();
	    driver.navigate().to(url);
		System.out.println("Application opend");
	}
	public void closeApplication() 
	{
		driver.close();
		System.out.println("application close");

}
	public void logout()
	{
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("logout complete");
	}
	public void login() 
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pwd);
		//Thread.sleep(3000);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("login complite");
		Log.info("login app");
	}
	public void enterFrame() {
		driver.switchTo().frame(frame_empInfo);
		System.out.println("enter into frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exit frome the frame");
	}
	public void addNewEmp() //throws Exception
	{
		driver.findElement(By.xpath(btn_Add)).click();
		System.out.println("add button clicked");
		//Thread.sleep(3000);
		driver.findElement(By.name(txt_efn)).sendKeys(EFN);
		driver.findElement(By.name(txt_eln)).sendKeys(ELN);
		//Thread.sleep(3000);
		System.out.println("emplyee info entered");
		driver.findElement(By.id(btn_Save)).click();
		System.out.println("emp info save");
	}
	
	
	

	
}