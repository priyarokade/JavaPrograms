@LoginTest
Feature: Valid LoginTest
     
    @Regression
  Scenario Outline: Valid login Test with parameters 
  	Given User navigates to homepage url of the application
  	And User enters valid email "<username>"
    And User enters valid password "<password>"
    And User clicks on loginbutton
    Then User should see profile page 
    
  Examples:
  	|username             |password|
  	|abcdtest319@gmail.com| Test319|
   
 

 