package com.delta.login;

public class Base {
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aastha\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		return driver;
		
	}
	
	public static void getUrl(String txt) {
		driver.get(txt);
	}
	
	

}
