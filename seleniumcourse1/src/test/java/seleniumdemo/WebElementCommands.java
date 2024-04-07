package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void verifySingleInputField()
	{
		String name = "Divya Jolly";
		WebElement singleInputField =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(name);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement showMessageText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText = showMessageText.getText();
		String outputMessage = yourMessageText.replace("Your Message : ", "");
		if(name.equals(outputMessage))
		{
			System.out.println("TestCasePassed");
		}
		else
		{
			System.out.println("TestcaseFailed");
		}
	}
	public void verifyMultipleInputField()
	{
		int elementA = 23;
		int elementB = 56;
		int sum = elementA+elementB;
		String expected = "Total A + B : "+sum;
		WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement enterValueB =driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueA.sendKeys(String.valueOf(elementA));
		enterValueB.sendKeys(String.valueOf(elementB));
		WebElement getTotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		getTotalbutton.click();
		WebElement getTotalText = driver.findElement(By.xpath("//div[@id='message-two']"));
		String totaltext = getTotalText.getText();
		if(totaltext.equals(expected))
		{
			System.out.println("Test Case Passed - Multiple");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
	}

	public static void main(String[] args) {
		WebElementCommands webElementCommands = new WebElementCommands();
		webElementCommands.initializeBrowser();
		webElementCommands.verifySingleInputField();
		webElementCommands.verifyMultipleInputField();
		// TODO Auto-generated method stub

	}

}
