@LoginTest
Feature: LoginTest
   
   @sanity
  Scenario: Valid login Test
  	Given User navigates to homepage url of the application
  	And User enters valid username 
    And User enters valid Password
    And User clicks on loginbutton
    Then User should see profile page 
    
    
 