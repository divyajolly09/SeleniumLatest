package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandEx {
	WebDriver driver;
	public void initializeBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	public void browserQuit()
	{
		//driver.close();
		driver.quit();
	}
	private void webElementCommands() {
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		WebElement menuBar = driver.findElement(By.id("react-burger-menu-btn"));
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		

	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebElementCommandEx webelementcommandex= new WebElementCommandEx();
		webelementcommandex.initializeBrowser();
		webelementcommandex.webElementCommands();
//		webelementcommandex.browserQuit();

	}
	

}
