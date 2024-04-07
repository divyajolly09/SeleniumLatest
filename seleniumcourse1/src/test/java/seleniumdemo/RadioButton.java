package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
	public void verifySingleRadioButtonIsUnselected()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		//Verify radio buttons are unchecked by default
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean isMaleRadioButtonSelected=maleRadioButton.isSelected();
		System.out.println(isMaleRadioButtonSelected);
		WebElement FemaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isFemaleRadioButtonSelected=FemaleRadioButton.isSelected();
		System.out.println(isFemaleRadioButtonSelected);
		
		//Verify male radio button is clicked and selected
		maleRadioButton.click();
		isMaleRadioButtonSelected=maleRadioButton.isSelected();
		System.out.println(isMaleRadioButtonSelected);
	}
	
	public void groupButtonDemo()
	{
		//Verify Male Radio button in multiple group is selected
		WebElement maleRadioButton1=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		maleRadioButton1.click();
		boolean isMaleradioButtonNotSelected=maleRadioButton1.isSelected();
		System.out.println(isMaleradioButtonNotSelected);
		
		//Verify Patient Age Radio button is selected
		WebElement patientAgeRadiobutton=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		patientAgeRadiobutton.click();
		boolean isPatientRadiooButtonselected=patientAgeRadiobutton.isSelected();
		System.out.println(isPatientRadiooButtonselected);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		RadioButton radiobutton=new RadioButton();
		radiobutton.initializeBrowser();
		radiobutton.verifySingleRadioButtonIsUnselected();
		radiobutton.groupButtonDemo();
		radiobutton.browserQuit();
	}

}
