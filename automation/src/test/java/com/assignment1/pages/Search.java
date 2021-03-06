package com.assignment1.pages;

import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class Search {

	@FindBy(xpath="//select[@name='fromPort']")
	private SelenideElement DepartureCityDD;
	
	@FindBy(xpath="//select[@name='toPort']")
	private SelenideElement DestinationCityDD;
	
	@FindBy(xpath="//input[@value='Find Flights']")
	private SelenideElement FindFlightsButton;
	
	public void selectDepartCity(String depCity) {
		DepartureCityDD.shouldBe(Condition.visible).selectOption(depCity);
		Reporter.log("Departure City selected : "+ DepartureCityDD.getSelectedValue(),true);
	}
	
	public void selectDestinationCity(String destCity) {
		DestinationCityDD.shouldBe(Condition.visible).selectOption(destCity);
		Reporter.log("Destination City selected : "+ DestinationCityDD.getSelectedValue(),true);
	}
	
	public void clickFindFlightBtn() {
		FindFlightsButton.shouldBe(Condition.enabled).click();
	}
}
