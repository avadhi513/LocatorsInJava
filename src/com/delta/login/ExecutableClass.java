package com.delta.login;

public class ExecutableClass extends Base {
	
	public static void main(String[] args) {
		
		Base b = new Base();
		getDriver();
		
		getUrl();
		
		driver.findElement(By.id("email"));
		
	}
	
}
