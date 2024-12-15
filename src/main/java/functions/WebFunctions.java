package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebFunctions 

{
	public static ChromeDriver ch;
	public static WebElement ele;
	
	public void clickElement(By locator)
	{
		ele=getElement(locator);
		ele.click();

	}

	public void enterText(By locator, String text)
	{
		ele=getElement(locator);
		ele.sendKeys(text);
	}

	public static ChromeDriver launchURLinChrome(String URL)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\susmita\\chromedriver.exe");
		ch = new ChromeDriver();

		ch.get("https://expo.dev/login");
		ch.manage().window().maximize();

		return ch;
	}
	public WebElement getElement(By locator)
	{
		ele=ch.findElement(locator);
		return ele;
	}
	public String getCurrentURL()
	{
		String url=ch.getCurrentUrl();
		return url;
	}
	public void quitBrowser()
	{
		ch.quit();
	}
}
