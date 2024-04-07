package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxButton extends Base {
	
	public void verifySingleCheckBoxDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singleCheckBox = driver.findElement((By.xpath("//input[@id='gridCheck']")));
		singleCheckBox.click();
		Boolean isSingleCheckbox = singleCheckBox.isSelected();
		System.out.println(isSingleCheckbox);
	}
	public static void main(String[] args) {
		CheckboxButton checkboxbutton = new CheckboxButton();
		checkboxbutton.initializeBrowser();
		checkboxbutton.verifySingleCheckBoxDemo();
		checkboxbutton.browserQuit();
		// TODO Auto-generated method stub

	}

}
