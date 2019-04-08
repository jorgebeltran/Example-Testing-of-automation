# Login feature review the behavior in thie feature
#Jorge Beltran Aguilar
Feature: Login

  Background: Home page is displayed once set credential in login page
    Given  'courses ultimate qa' page is loaded
    When    set my credentials on 'Login' page
    And     sign out

  Scenario: hello word
