@test
Feature: F01_AddCourse | Course creation on Winjigo website

  Scenario: Create a new course
    Given User is on Winjigo login page
    When User logs in with username "testregister@aaa.com" and password "Wakram_123"
    And User navigates to courses page
    And User clicks on Add course button
    And User enters course details "Automation Course" 6
    And User clicks create
    Then User verifies the course "Automation Course" is displayed in the course list