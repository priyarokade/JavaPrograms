$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("validateProfile.feature");
formatter.feature({
  "line": 2,
  "name": "ValidateProfile",
  "description": "",
  "id": "validateprofile",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ValidateProfile"
    }
  ]
});
formatter.before({
  "duration": 42398256523,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User should logged in to URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User should see home page with profile link",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateProfileStepDefination.user_should_logged_in_to_URL()"
});
formatter.result({
  "duration": 6260518819,
  "status": "passed"
});
formatter.match({
  "location": "ValidateProfileStepDefination.user_should_see_home_page_with_profile_link()"
});
formatter.result({
  "duration": 3143876759,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Write Review for Health plan insurance for new user",
  "description": "",
  "id": "validateprofile;write-review-for-health-plan-insurance-for-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User Clicks on url \"https://wallethub.com/profile/test-insurance-company-13732055i\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User should see profile page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Scroll down page and hover on review Stars and Clicks on fifth star",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Test Insurance review page is diplayed",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User selects \"Health Insurance\" plan",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Writes review \"This is sample review to test the functionality is working fine or not,This is sample review to test the functionality is working fine or not\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Click\u0027s on Submit Button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should see Review Confirmation Message",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "When user navigates to profile page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Check for review",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User should see review text correctly \"This is sample review to test the functionality is working fine or not,This is sample review to test the functionality is working fine or not\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://wallethub.com/profile/test-insurance-company-13732055i",
      "offset": 20
    }
  ],
  "location": "ValidateProfileStepDefination.user_Clicks_on_url(String)"
});
formatter.result({
  "duration": 2544640033,
  "status": "passed"
});
formatter.match({
  "location": "ValidateProfileStepDefination.user_should_see_profile_page()"
});
formatter.result({
  "duration": 324484889,
  "status": "passed"
});
formatter.match({
  "location": "ValidateProfileStepDefination.user_Scroll_down_page_and_hover_on_review_Stars_and_Clicks_on_fifth_star()"
});
formatter.result({
  "duration": 58502577804,
  "status": "passed"
});
formatter.match({
  "location": "ValidateProfileStepDefination.test_Insurance_review_page_is_diplayed()"
});
formatter.result({
  "duration": 236399488,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Health Insurance",
      "offset": 14
    }
  ],
  "location": "ValidateProfileStepDefination.user_selects_plan(String)"
});
formatter.result({
  "duration": 858115525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is sample review to test the functionality is working fine or not,This is sample review to test the functionality is working fine or not",
      "offset": 15
    }
  ],
  "location": "ValidateProfileStepDefination.writes_review(String)"
});
formatter.result({
  "duration": 1231385279,
  "status": "passed"
});
formatter.match({
  "location": "ValidateProfileStepDefination.click_s_on_Submit_Button()"
});
formatter.result({
  "duration": 564550532,
  "status": "passed"
});
formatter.match({
  "location": "ValidateProfileStepDefination.user_should_see_Review_Confirmation_Message()"
});
formatter.result({
  "duration": 1991449752,
  "status": "passed"
});
formatter.match({
  "location": "ValidateProfileStepDefination.when_user_navigates_to_profile_page()"
});
formatter.result({
  "duration": 4774619782,
  "status": "passed"
});
formatter.match({
  "location": "ValidateProfileStepDefination.check_for_review()"
});
formatter.result({
  "duration": 696601939,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This is sample review to test the functionality is working fine or not,This is sample review to test the functionality is working fine or not",
      "offset": 39
    }
  ],
  "location": "ValidateProfileStepDefination.user_should_see_review_text_correctly(String)"
});
formatter.result({
  "duration": 304791954,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 8415922969,
  "status": "passed"
});
});