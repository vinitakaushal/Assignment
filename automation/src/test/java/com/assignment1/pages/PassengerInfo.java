package com.assignment1.pages;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class PassengerInfo {
@FindBy(id="inputName")
private SelenideElement FirstNameInput;

@FindBy(id="city")
private SelenideElement CityInput;

@FindBy(id="state")
private SelenideElement StateInput;

@FindBy(id="zipCode")
private SelenideElement ZipCodeInput;

@FindBy(xpath="//select[@id='cardType']")
private SelenideElement CardTypeDD;

@FindBy(id="creditCardNumber")
private SelenideElement CreditCardNoInput;

@FindBy(id="creditCardMonth")
private SelenideElement CreditCardMonthInput;

@FindBy(id="nameOnCard")
private SelenideElement CreditCardInput;

@FindBy(xpath="//input[@value='Purchase Flight']")
private SelenideElement PurchaseFlightButton;

public void sendFirstName(String name) {
	FirstNameInput.shouldBe(Condition.visible).sendKeys(name);
}

public void sendCity(String city) {
	CityInput.shouldBe(Condition.visible).sendKeys(city);
}

public void sendState(String state) {
	StateInput.shouldBe(Condition.visible).sendKeys(state);
}

public void sendZipCode(String zipcode) {
	ZipCodeInput.shouldBe(Condition.visible).sendKeys(zipcode);
}

public void selectCardType(String value) {
	CardTypeDD.shouldBe(Condition.visible).selectOption(value);
}

public void sendCreditCardNum(String no) {
	CreditCardNoInput.shouldBe(Condition.visible).sendKeys(no);
}

public void sendCCMonth(String month) {
	CreditCardMonthInput.shouldBe(Condition.visible).sendKeys(month);
}

public void sendCCName(String name) {
	CreditCardInput.shouldBe(Condition.visible).sendKeys(name);
}

public void clickPurchaseFlightButton() {
	PurchaseFlightButton.shouldBe(Condition.visible).click();
}
}
