package com.qa.stepdefition;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.base;
import com.qa.pageobject.qafoxhome;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dropdownsteps extends base {
	
	Select select;
	qafoxhome qa=new qafoxhome(driver);;
	
	@Given("dropdown webelement")
	public void dropdown_webelement() {
		 select=new Select(qa.drop());
	   
	     
	}
	@When("select swift")
	public void select_swift() {
		
        
        
        select.selectByIndex(2);
       
	}
	@Then("swift shoul selected")
	public void swift_shoul_selected() {
		 
		boolean s=	qa.swift().isSelected();
		
	 
	     assertEquals(true,s);
	    
	     

	}




}
