package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import functions.WebFunctions;
import objectRepo.Objects;

public class MainclassFW implements Objects{

	public static WebFunctions fn =new WebFunctions();
	//public static void main(String[] args) throws InterruptedException 
	@Test
	public static void myFirstTest()
	{
		try {
			WebFunctions.launchURLinChrome("https://expo.dev/login");
			Thread.sleep(2000);
			String strUN="susmitaexpo";	
			fn.enterText(userName, strUN);
			String strPW="ExpoSusmita@1";
			fn.enterText(password, strPW);
			String currentUrl = fn.getCurrentURL();
			System.out.println(currentUrl);
			String expectedurl = "https://expo.dev/login";
			if(currentUrl.equalsIgnoreCase(expectedurl))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			fn.quitBrowser();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
