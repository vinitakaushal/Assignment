package com.assignment1.automation;
import com.assignment1.pages.Confirmation;
import com.assignment1.pages.FlightRecommendation;
import com.assignment1.pages.PassengerInfo;
import com.assignment1.pages.Search;
import com.assignment1.utility.*;
import com.codeborne.selenide.Configuration;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.close;

public class BookingFlow {
	@BeforeTest
    public void setChromeAsBrowser(){
        Configuration.browser = "chrome";
        Configuration.timeout = 60000;
    }
	
  @Test
  public void launchURL() throws InterruptedException {
		/*
		 * Properties prop = new Properties(); prop =
		 * UtilityMethods.OpenProperties(Constants.SYSTEM_PATH +
		 * Constants.ENV_PROP_PATH); open(prop.get("URL").toString());
		 */
	  open("https://blazedemo.com/");
		Thread.sleep(3000);
  }
  @Test(dependsOnMethods = "launchURL")
  public void searchFlight() {
	  Search spage = page(Search.class);
	  spage.selectDepartCity("Paris");
	  spage.selectDestinationCity("London");
	  spage.clickFindFlightBtn();
  }
  @Test(dependsOnMethods = "searchFlight")
  public void selectRecommendation() {
	  FlightRecommendation frpage=page(FlightRecommendation.class);
	  frpage.clickChooseFlightByRow(2);
  }
  @Test(dependsOnMethods = "selectRecommendation")
  public void fillPassengerInfo() {
	  PassengerInfo ppage=page(PassengerInfo.class);
	  ppage.sendFirstName("Vinita");
	  ppage.sendCity("Bangalore");
	  ppage.sendState("Karnataka");
	  ppage.sendZipCode("501234");
	  ppage.sendCCMonth("09");
	  ppage.sendCreditCardNum("4012999999999999");
	  ppage.sendCCName("Vinita");
	  ppage.clickPurchaseFlightButton();
  }
  @Test(dependsOnMethods = "fillPassengerInfo")
  public void validateConfirmationId() {
	  Confirmation cpage=page(Confirmation.class);
	  cpage.validateConfirmationId();
  }
  
  @AfterClass()
  public void quit() {
	  close();
  }
  }
