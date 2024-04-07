package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
	public void radioButtonDemo()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
		System.out.println(isMaleRadioButtonSelected);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		RadioButton radiobutton=new RadioButton();
		radiobutton.initializeBrowser();
		radiobutton.radioButtonDemo();
		radiobutton.browserQuit();
		

	}

}
