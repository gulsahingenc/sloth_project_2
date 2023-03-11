Feature: User should be able to login with valid credentials

  Background:
 Given user is on fidexio login page


  Scenario: user can log in with Sales valid credantial
    When user enters "salesmanager34@info.com" as username in  Email field
    And  "salesmanager" as password in Password field
    And  click Log in button
    Then user should be on the dashboard

  Scenario Outline: user can log in with Sales valid credantial 2
    When user enters "<salesmanagerUserName>" as username in  Email field
    And  "<salesmanagerPassword>" as password in Password field
    And  click Log in button
    Then user should be on the dashboard
    Examples:
      | salesmanagerUserName    | salesmanagerPassword |
      | salesmanager15@info.com | salesmanager         |
      | salesmanager36@info.com | salesmanager         |
      | salesmanager57@info.com | salesmanager         |
      | salesmanager58@info.com | salesmanager         |


