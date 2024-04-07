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
	public void verifyMultiplecheckBoxDemo()
	{
		//Verify all four check boxes are unselected by default
		
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean isCheckBoxOneIsSelected=checkBoxOne.isSelected();
		System.out.println(isCheckBoxOneIsSelected);
		
		WebElement checkBoxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean isCheckBoxTwoIsSelected=checkBoxTwo.isSelected();
		System.out.println(isCheckBoxTwoIsSelected);
		
		WebElement checkBoxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean isCheckBoxThreeIsSelected=checkBoxThree.isSelected();
		System.out.println(isCheckBoxThreeIsSelected);
		
		WebElement checkBoxfour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean isCheckBoxFourIsSelected=checkBoxfour.isSelected();
		System.out.println(isCheckBoxFourIsSelected);
		
		//Verify all four checkboxes are checked when SelectAll button is clicked
		WebElement selectAllButton=driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		
		isCheckBoxOneIsSelected=checkBoxOne.isSelected();
		System.out.println(isCheckBoxOneIsSelected);
		isCheckBoxTwoIsSelected=checkBoxTwo.isSelected();
		System.out.println(isCheckBoxTwoIsSelected);
		isCheckBoxThreeIsSelected=checkBoxThree.isSelected();
		System.out.println(isCheckBoxThreeIsSelected);
		isCheckBoxFourIsSelected=checkBoxfour.isSelected();
		System.out.println(isCheckBoxFourIsSelected);
		
		//Verify Button name is changed to UnselectAll
		String buttonName = selectAllButton.getAttribute("value");
		System.out.println(buttonName);
		
		//Verify all four checkboxes are unchecked when UnselectAll button is clicked
		selectAllButton.click();
		
		isCheckBoxOneIsSelected=checkBoxOne.isSelected();
		System.out.println(isCheckBoxOneIsSelected);
		isCheckBoxTwoIsSelected=checkBoxTwo.isSelected();
		System.out.println(isCheckBoxTwoIsSelected);
		isCheckBoxThreeIsSelected=checkBoxThree.isSelected();
		System.out.println(isCheckBoxThreeIsSelected);
		isCheckBoxFourIsSelected=checkBoxfour.isSelected();
		System.out.println(isCheckBoxFourIsSelected);
		
		//Verify Button name is changed to SelectAll
		String buttonName1 = selectAllButton.getAttribute("value");
		System.out.println(buttonName1);		
	}
	
	public static void main(String[] args) {
		CheckboxButton checkboxbutton = new CheckboxButton();
		checkboxbutton.initializeBrowser();
		checkboxbutton.verifySingleCheckBoxDemo();
		checkboxbutton.verifyMultiplecheckBoxDemo();
		checkboxbutton.browserQuit();
		// TODO Auto-generated method stub

	}

}
