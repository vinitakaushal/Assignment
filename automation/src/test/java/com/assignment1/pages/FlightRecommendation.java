package com.assignment1.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FlightRecommendation {

	
public void clickChooseFlightByRow(int i) {
	SelenideElement ChooseFlightButton =$(By.xpath("(//input[@value='Choose This Flight'])["+i+"]"));
	ChooseFlightButton.shouldBe(Condition.visible).click();	
	Reporter.log(i+" nd Row Flight selected..",true);
}

public void clickChooseFlightByFlightNumber(String flightNo) {
	SelenideElement ChooseFlightBtn=$(By.xpath("//td[text()='"+flightNo+"']//ancestor::tr//input[@value='Choose This Flight']"));
	ChooseFlightBtn.shouldBe(Condition.enabled).click();
}
}
