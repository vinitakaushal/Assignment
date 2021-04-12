The framework supports Selenide+TestNG+RestAssured

The project contains UI Automation Test and Rest Assured API test.
--------------------------------------------------------------------------------
UI Automation Test is E2E booking flow. Separate classes for respective page - Search, FlightRecommendation, PassengerInfo and COnfirmation page.
All respective elements and methods are written in respective pages.
----------------------------------------------------------------------------------------
Rest Assured API Tests are covering parsing the JSON content, extracting data, and validating response code and body.

#Execution of UI Automation Test
Under Suites folder-> open Booking.xml file and RunAs TestNG Suite
Logs can be seen under console.

#Execution of API Tests
Under Suites folder-> open ParseJson.xml and RunAs TestNG Suite
Logs can be seen under console.

Under /automation/src/test/java/com/assignment1/restAssured/task2 -> Open ExecuteAPI.java and Run As Java Application

Logs can be seen under console.