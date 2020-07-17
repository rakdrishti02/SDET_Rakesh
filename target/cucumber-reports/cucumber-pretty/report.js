$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Elearning.feature");
formatter.feature({
  "line": 2,
  "name": "To test the test case ELSC_011",
  "description": "I want to use this template for my feature file",
  "id": "to-test-the-test-case-elsc-011",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ElearningFeature"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Login to elarning site with admin user",
  "description": "",
  "id": "to-test-the-test-case-elsc-011;login-to-elarning-site-with-admin-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter the username as \"admin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter the password as \"admin@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on link classes",
  "keyword": "When "
});
formatter.match({
  "location": "Elearning_StepDefinition.i_launch_the_application()"
});
formatter.result({
  "duration": 16846942200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 25
    }
  ],
  "location": "Elearning_StepDefinition.i_enter_the_username_as(String)"
});
formatter.result({
  "duration": 218097300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@123",
      "offset": 23
    }
  ],
  "location": "Elearning_StepDefinition.enter_the_password_as(String)"
});
formatter.result({
  "duration": 518719400,
  "status": "passed"
});
formatter.match({
  "location": "Elearning_StepDefinition.i_click_on_login_button()"
});
formatter.result({
  "duration": 5260339400,
  "status": "passed"
});
formatter.match({
  "location": "Elearning_StepDefinition.I_click_on_link_classes()"
});
formatter.result({
  "duration": 4304746600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "To add new classes in the elearnig site",
  "description": "",
  "id": "to-test-the-test-case-elsc-011;to-add-new-classes-in-the-elearnig-site",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@addClass"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I click on Add classes icon",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Enter valid credential in name textbox as \"demo_Rak1\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Enter valid credentail in the description as \"demo_Rak1\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select \"Open\" from the group permission list",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click on Add button",
  "keyword": "Then "
});
formatter.match({
  "location": "Elearning_StepDefinition.clickonAddClasses()"
});
formatter.result({
  "duration": 1102481600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo_Rak1",
      "offset": 43
    }
  ],
  "location": "Elearning_StepDefinition.enter_valid_credential_in_name_textbox_as(String)"
});
formatter.result({
  "duration": 427285000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo_Rak1",
      "offset": 46
    }
  ],
  "location": "Elearning_StepDefinition.enter_valid_credentail_in_the_description_as(String)"
});
formatter.result({
  "duration": 282102700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Open",
      "offset": 8
    }
  ],
  "location": "Elearning_StepDefinition.select_from_the_group_permission_list(String)"
});
formatter.result({
  "duration": 440926900,
  "status": "passed"
});
formatter.match({
  "location": "Elearning_StepDefinition.click_on_Add_button()"
});
formatter.result({
  "duration": 1870173100,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "To Subsribe new users to the classes",
  "description": "",
  "id": "to-test-the-test-case-elsc-011;to-subsribe-new-users-to-the-classes",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@addUsers"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I select the class \"RPA Automation\"",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I select user by starting letter \"R\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "validate the successful message",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "RPA Automation",
      "offset": 20
    }
  ],
  "location": "Elearning_StepDefinition.clickOnSubscriberUsersToClass(String)"
});
formatter.result({
  "duration": 10110197400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R",
      "offset": 34
    }
  ],
  "location": "Elearning_StepDefinition.selectUser(String)"
});
formatter.result({
  "duration": 6783555700,
  "status": "passed"
});
formatter.match({
  "location": "Elearning_StepDefinition.validateUpdate()"
});
formatter.result({
  "duration": 107035000,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "To subscribe classes to courses",
  "description": "",
  "id": "to-test-the-test-case-elsc-011;to-subscribe-classes-to-courses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@addCourses"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I select the new class \"RPA Automation\"",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I select the first letter as \"B\"",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Validate class is subscribed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "RPA Automation",
      "offset": 24
    }
  ],
  "location": "Elearning_StepDefinition.clickOnSubscribeClasses(String)"
});
formatter.result({
  "duration": 6398407700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "B",
      "offset": 30
    }
  ],
  "location": "Elearning_StepDefinition.selectCourseTitle(String)"
});
formatter.result({
  "duration": 2447363300,
  "status": "passed"
});
formatter.match({
  "location": "Elearning_StepDefinition.validateClass()"
});
formatter.result({
  "duration": 3263242200,
  "status": "passed"
});
});