$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("InvalidLoginTest.feature");
formatter.feature({
  "line": 2,
  "name": "Invalid LoginTest",
  "description": "",
  "id": "invalid-logintest",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Invalid login Test with parameters",
  "description": "",
  "id": "invalid-logintest;invalid-login-test-with-parameters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigates to homepage url of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters invalid email \"\u003cusername1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters invalid password \"\u003cpassword1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on loginbutton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should not see profile page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "invalid-logintest;invalid-login-test-with-parameters;",
  "rows": [
    {
      "cells": [
        "username1",
        "password1"
      ],
      "line": 12,
      "id": "invalid-logintest;invalid-login-test-with-parameters;;1"
    },
    {
      "cells": [
        "abcdtest@gmail.com",
        "Test319"
      ],
      "line": 13,
      "id": "invalid-logintest;invalid-login-test-with-parameters;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2630953888,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Invalid login Test with parameters",
  "description": "",
  "id": "invalid-logintest;invalid-login-test-with-parameters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigates to homepage url of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters invalid email \"abcdtest@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters invalid password \"Test319\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on loginbutton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should not see profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.user_navigates_to_homepage_url_of_the_application()"
});
formatter.result({
  "duration": 2486079224,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcdtest@gmail.com",
      "offset": 27
    }
  ],
  "location": "LoginStepDefinations.user_enters_invalid_email(String)"
});
formatter.result({
  "duration": 138822704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test319",
      "offset": 30
    }
  ],
  "location": "LoginStepDefinations.user_enters_invalid_password(String)"
});
formatter.result({
  "duration": 72615050,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_clicks_on_loginbutton()"
});
formatter.result({
  "duration": 2445698623,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_should_not_see_profile_page()"
});
formatter.result({
  "duration": 34412563,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 961175849,
  "status": "passed"
});
formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 2,
  "name": "LoginTest",
  "description": "",
  "id": "logintest",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.before({
  "duration": 2038531126,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Valid login Test",
  "description": "",
  "id": "logintest;valid-login-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigates to homepage url of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters valid username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters valid Password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on loginbutton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.user_navigates_to_homepage_url_of_the_application()"
});
formatter.result({
  "duration": 2266986514,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_enters_valid_username()"
});
formatter.result({
  "duration": 180045354,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_enters_valid_Password()"
});
formatter.result({
  "duration": 76537205,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_clicks_on_loginbutton()"
});
formatter.result({
  "duration": 3350920911,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_should_see_profile_page()"
});
formatter.result({
  "duration": 1393083636,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1062611316,
  "status": "passed"
});
formatter.uri("ValidLoginTest.feature");
formatter.feature({
  "line": 2,
  "name": "Valid LoginTest",
  "description": "",
  "id": "valid-logintest",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Valid login Test with parameters",
  "description": "",
  "id": "valid-logintest;valid-login-test-with-parameters",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigates to homepage url of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters valid email \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on loginbutton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see profile page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "valid-logintest;valid-login-test-with-parameters;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "valid-logintest;valid-login-test-with-parameters;;1"
    },
    {
      "cells": [
        "abcdtest319@gmail.com",
        "Test319"
      ],
      "line": 14,
      "id": "valid-logintest;valid-login-test-with-parameters;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1975110907,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Valid login Test with parameters",
  "description": "",
  "id": "valid-logintest;valid-login-test-with-parameters;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    },
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigates to homepage url of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters valid email \"abcdtest319@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters valid password \"Test319\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on loginbutton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinations.user_navigates_to_homepage_url_of_the_application()"
});
formatter.result({
  "duration": 3749034976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcdtest319@gmail.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefinations.user_enters_valid_email(String)"
});
formatter.result({
  "duration": 154542355,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test319",
      "offset": 28
    }
  ],
  "location": "LoginStepDefinations.user_enters_valid_password(String)"
});
formatter.result({
  "duration": 78230823,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_clicks_on_loginbutton()"
});
formatter.result({
  "duration": 4783728223,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinations.user_should_see_profile_page()"
});
formatter.result({
  "duration": 282238242,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1008716331,
  "status": "passed"
});
});