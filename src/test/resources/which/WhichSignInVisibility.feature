Feature: Visibility of the options for not signed in user

  Not signed in user have to see sign up/log in buttons on the television page. User shouldn't be allowed to use all options for signed in customers.

  Background: Open Which? television page
    Given I am on Which? television page
    And Page loads

  Scenario: Sign up buttons are visible
    Then I see sign up button in top navigation bar
    And I see sign up button in left menu

  Scenario: Anonymous customer is not able to use member exclusives options
    When I can see log in button
    And I click best buy tick box
    Then URL stays the same

    #Using search options changes URL

  Scenario: Returning customer can find log in option
    When I click log in option
    Then It redirects me to log in page



