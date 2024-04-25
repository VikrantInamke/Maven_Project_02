package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchButtonPage {
	public static WebDriver driver ;
	
	public GoogleSearchButtonPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(xpath = "//*[@id='APjFqb']")
		public WebElement searchbox ;
		
		@FindBy(xpath = "//*[@class='gNO89b']")
		public WebElement searchbutton ;

		public void enterData(){
			searchbox.sendKeys("Selenium WebDriver");
			searchbutton.click();
		}

}
