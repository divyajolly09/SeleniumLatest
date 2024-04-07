package seleniumdemo;

public class BrowserCommands extends Base{
	public void browserCommands()
	{
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();
			
	}
	public void navigationCommands()
	{
		driver.navigate().to("https://github.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.initializeBrowser();
		
		browsercommands.navigationCommands();
		browsercommands.browserQuit();
		
		
		

	}

}
