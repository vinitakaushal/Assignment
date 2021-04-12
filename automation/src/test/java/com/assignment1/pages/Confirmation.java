package com.assignment1.pages;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class Confirmation {
@FindBy(xpath="//td[text()='Id']/following-sibling::td")
private SelenideElement ConfirmationNum;

public void validateConfirmationId() {
	Assert.assertTrue("Confirmation Id is not displayed",ConfirmationNum.shouldBe(Condition.visible).isDisplayed());
	Reporter.log("Confirmation Id for the booking : "+ConfirmationNum.getText(),true);
}
}
