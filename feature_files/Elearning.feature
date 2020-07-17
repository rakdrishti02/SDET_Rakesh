@ElearningFeature
Feature: To test the test case ELSC_011
  I want to use this template for my feature file

  @login
  Scenario: Login to elarning site with admin user
    Given I launch the application
    Then I enter the username as "admin"
    And Enter the password as "admin@123"
    Then I click on login button
    When I click on link classes

  @addClass
  Scenario: To add new classes in the elearnig site
    Given I click on Add classes icon
    When Enter valid credential in name textbox as "demo_Rak1"
    And Enter valid credentail in the description as "demo_Rak1"
    And select "Open" from the group permission list
    Then click on Add button

  @addUsers
  Scenario: To Subsribe new users to the classes
    Given I select the class "RPA Automation"
    Then I select user by starting letter "R"
    And validate the successful message

  @addCourses
  Scenario: To subscribe classes to courses
    Given I select the new class "RPA Automation"
    Then I select the first letter as "B"
    And Validate class is subscribed
