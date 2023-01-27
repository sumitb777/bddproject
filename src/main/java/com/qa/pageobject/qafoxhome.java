package com.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qafoxhome  {
	
	public WebDriver driver;
	public qafoxhome (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='multiselect1']")
		WebElement drop;
	
	public WebElement drop() {
		return drop;
	}
@FindBy(xpath="//option[@value='swiftx']")
WebElement swift;
public WebElement swift() {
	return swift;
}
	

}
