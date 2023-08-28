Feature: Login scenarios

  @TC01 @Test_id_TC01
  Scenario: User is able to login
    Given User navigates to the login page
    Then User Enters "username" in field "HomePageLocators.userName"
    Then User Enters "password" in field "HomePageLocators.password"
    Then User Clicks on "HomePageLocators.loginButton"
    Then User verifies "Swag Labs" text is present at "HomePageLocators.banner"

  @TC01 @Test_id_TC02
  Scenario: User is able to login
    Given User navigates to the login page
    And User Enters "username" in field "HomePageLocators.userName"
    Then User Enters "password" in field "HomePageLocators.password"
    Then User Clicks on "HomePageLocators.loginButton"
    Then User verifies "Epic sadface: Sorry, this user has been locked out." text is present at "HomePageLocators.lockedOut"

  @TC01 @Test_id_TC03
  Scenario: User is able to login
    Given User navigates to the login page
    Then User Enters "username" in field "HomePageLocators.userName"
    Then User Enters "password" in field "HomePageLocators.password"
    Then User Clicks on "HomePageLocators.loginButton"
    Then User verifies "Swag Labs" text is present at "HomePageLocators.banner"

  @TC01 @Test_id_TC04
  Scenario: User is able to login
    Given User navigates to the login page
    Then User Enters "username" in field "HomePageLocators.userName"
    Then User Enters "password" in field "HomePageLocators.password"
    Then User Clicks on "HomePageLocators.loginButton"
    Then User verifies "Swag Labs" text is present at "HomePageLocators.banner"



#    @TC02 @Test_id_TC02
#  Scenario: User is able to login
##    Given User navigates to the login page
##    Then User Enters username
#    Then User prints Test Data