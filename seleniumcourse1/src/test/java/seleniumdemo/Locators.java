package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void webelementcommand()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		WebElement radiobutton=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement checkboxbutton=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement selectInput=driver.findElement(By.linkText("Select Input"));
		WebElement form=driver.findElement(By.linkText("Form Submit"));
		WebElement ajaxForm=driver.findElement(By.linkText("Ajax Form Submit"));
		
		WebElement partial=driver.findElement(By.partialLinkText("Radio Buttons "));
		WebElement partialLinkTest=driver.findElement(By.partialLinkText("Checkbox"));
		WebElement partialLinkTest1=driver.findElement(By.partialLinkText("Select In"));
		WebElement partialLinkTest2=driver.findElement(By.partialLinkText("Form"));
		WebElement partialLinkTest3=driver.findElement(By.partialLinkText("Ajax"));
		
		WebElement name=driver.findElement(By.name("keywords"));
		WebElement name1=driver.findElement(By.name("viewport"));
		WebElement name2=driver.findElement(By.name("description"));
		WebElement name3=driver.findElement(By.name("author"));
		
		
		WebElement tagname=driver.findElement(By.tagName("ul"));
		WebElement tagname1=driver.findElement(By.tagName("li"));
		WebElement tagname2=driver.findElement(By.tagName("div"));
		WebElement tagname3=driver.findElement(By.tagName("input"));
		WebElement tagname4=driver.findElement(By.tagName("button"));
		
		WebElement cssselector=driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssselectorClass=driver.findElement(By.cssSelector("a.navbar-brand"));
		WebElement attribute=driver.findElement(By.cssSelector("button[data-target='#collapsibleNavbar']"));
		
		WebElement cssselector1=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement cssSelectorClass1=driver.findElement(By.cssSelector("section.clearfix"));
		WebElement atribute1=driver.findElement(By.cssSelector("button[data-toggle='collapse']"));
		
		WebElement cssselector2=driver.findElement(By.cssSelector("input#value-a"));
		WebElement cssSelectorClass2=driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement atribute2=driver.findElement(By.cssSelector("label[for='inputEmail4']"));
		
		WebElement cssselector3=driver.findElement(By.cssSelector("input#value-b"));
		WebElement cssSelectorClass3=driver.findElement(By.cssSelector("div.header-top"));
		WebElement atribute3=driver.findElement(By.cssSelector("input[placeholder='Message']"));
		
		
		WebElement xpathExample=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement containsEx=driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
		WebElement startswithEx=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement textSample=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement combination=driver.findElement(By.xpath("//button[@id='button-one' and text()='Show Message']"));
		WebElement combinations=driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Message']"));
		
		WebElement getButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement containsEx1=driver.findElement(By.xpath("//button[contains(@id,'-two')]"));
		WebElement startswithEx1=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
		WebElement textSample1=driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement combination1=driver.findElement(By.xpath("//button[@id='button-two' and text()='Get Total' ]"));
		WebElement combinations1=driver.findElement(By.xpath("//button[@id='button-two' or text()='Get Total' ]"));
		
		WebElement getButton1=driver.findElement(By.xpath("//div[@id='message-two']"));
		WebElement containsEx2=driver.findElement(By.xpath("//div[contains(@id,'message-t')]"));
		WebElement startswithEx2=driver.findElement(By.xpath("//div[starts-with(@id,'message-t')]"));
    	WebElement textSample2=driver.findElement(By.xpath("//div[contains(text(),'Total A + B :')]"));
		
    	WebElement parentTechnic=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
		WebElement childTechnic=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
		WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		WebElement preceding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='header-top']"));
		WebElement ancestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='row']"));
		WebElement descendent=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::a"));
		
		WebElement parentTechnic1=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
		WebElement childTechnic1=driver.findElement(By.xpath("//form[@method='POST']//child::div"));
		WebElement following1=driver.findElement(By.xpath("//div[@class='example my-3']//following::div[@class='container']"));
		WebElement preceding1=driver.findElement(By.xpath("//div[@class='example my-3']//preceding::div[@class='container']"));
		WebElement ancestor1=driver.findElement(By.xpath("//div[@id='message-two']//ancestor::div[@class='card-body']"));
		WebElement descendant1=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//descendant::a[@id='others']"));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators webelementcommands=new Locators();
		webelementcommands.initializeBrowser();
		webelementcommands.webelementcommand();
//		webelementcommands.browserQuit();

	}

}
