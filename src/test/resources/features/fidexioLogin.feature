Feature: User should be able to login with valid credentials

  Background: For the scenarios in the feature file, user is expected to be on login page
 Given user is on fidexio login page


 @FID10-265
  Scenario Outline: user can log in with SalesManager

    When user enter salesmanager username "<salesmanagerUserName>"
    And  user enter salesmanager password "<salesmanagerPassword>"
    And click Log in button
    Then user(salesmanager) should be on the dashboard

    Examples:
      | salesmanagerUserName    | salesmanagerPassword |
      | salesmanager15@info.com | salesmanager         |
      | salesmanager36@info.com | salesmanager         |
      | salesmanager57@info.com | salesmanager         |

@FID10-328
  Scenario: user can log in with Pos  valid credantial
    When user enters "posmanager6@info.com" as username in  Email field
    And  "posmanager" as password in Password field
    And  click Log in button
    Then user should be on the dashboard

@FID10-329
  Scenario Outline: "Wrong login/password" should be displayed for invalid credentials
    When  user enter "<userName>" and "<password>"
    And click Log in button
    Then "Wrong login/password" should be displayed

    Examples:
      | userName                 |    password     |
      | posmanag5@info.com       | ssales          |
      | salesmanager12@info.com  | slsmng          |
      | posmaneger0@info.com     | posmanager      |

@FID10-330
  Scenario Outline: "Please fill out this field" message should be displayed if the username or password field is empty
    When user enters only an "<email>" or "<password>"
    Then  user should see warning message to fill empty fields when trying to log in
    Examples:
      | email                   | password   |
      | salesmanager15@info.com |            |
      |                         | posmanager |
      |                         |            |


@FID10-331
  Scenario:  after clicking on the "Reset password" link user on the "reset password" page
    When  user click "Reset password" link
    Then user on the "reset password" page

  @FID10-332
  Scenario:  User should see the password in bullet signs by default
    When  "posmanager" as password in Password field
    Then  User should see the password displayed in bullet signs

@FID10-333
  Scenario: Verify if the "Enter" key of the keyboard is working correctly on the login page
    When user enter "salesmanager8@info.com" into the email field
    And user enter "salesmanager" into the password field
    When user enter "Enter" key of the keyboard
    Then user should be on the login page


