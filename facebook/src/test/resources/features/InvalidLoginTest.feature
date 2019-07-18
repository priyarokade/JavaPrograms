@LoginTest
Feature: Invalid LoginTest

     @Regression
  Scenario Outline: Invalid login Test with parameters 
  	Given User navigates to homepage url of the application
  	And User enters invalid email "<username1>"
    And User enters invalid password "<password1>"
    And User clicks on loginbutton
    Then User should not see profile page
  Examples:
  	|username1         |password1|
  	|abcdtest@gmail.com|Test319|
   
    

 