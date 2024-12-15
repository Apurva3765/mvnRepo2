package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import functions.WebFunctions;
import objectRepo.Objects;

public class Mainclass implements Objects{

	public static WebFunctions fn =new WebFunctions();
	public static void main(String[] args) throws InterruptedException 
	
	{
//	System.setProperty("webdriver.chrome.driver", "D:\\susmita\\chromedriver.exe");
//	ChromeDriver ch = new ChromeDriver();
//	
//	ch.get("https://expo.dev/login");
//	ch.manage().window().maximize();
		
		WebFunctions.launchURLinChrome("https://expo.dev/login");
	
	Thread.sleep(2000);
	//ch.findElement(userName).sendKeys("susmitaexpo");
	String strUN="susmitaexpo";
	
	fn.enterText(userName, strUN);
	
	
//	Thread.sleep(2000);
//	ch.findElement(password).sendKeys("ExpoSusmita@1");
//	WebElement 
//	ch.findElement(login).click();
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
	
}
