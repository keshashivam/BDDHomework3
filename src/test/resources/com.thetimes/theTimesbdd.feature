@java
Feature: Digital pack subscription on the times

  As a user
  I should subscribe digital pack
  so that i can use the times digital services for 8 weeks


  Scenario: user should subscripe the digital pack subscription successfullu
    Given  user is on home page
    When   user  Click on Subscripe the times services
    And    user select digital pack for 8 weeks
    Then   user should get digital services subscriptin for  8 weeks



