@ValidateProfile
Feature: ValidateProfile
  

  Background: User navigates to Application URL
    Given User should logged in to URL 
    Then User should see home page with profile link
   
   @sanity
  Scenario: Write Review for Health plan insurance for new user
  	Given User Clicks on url "https://wallethub.com/profile/test-insurance-company-13732055i"
  	And User should see profile page 
    When User Scroll down page and hover on review Stars and Clicks on fifth star 
    And Test Insurance review page is diplayed 
    And User selects "Health Insurance" plan
    And Writes review "This is sample review to test the functionality is working fine or not,This is sample review to test the functionality is working fine or not"
    And Click's on Submit Button
    And User should see Review Confirmation Message
    And When user navigates to profile page
    And Check for review
    Then User should see review text correctly "This is sample review to test the functionality is working fine or not,This is sample review to test the functionality is working fine or not"
    
 
    

 