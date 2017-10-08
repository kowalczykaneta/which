Feature: Television search

  On the Which? television page user is able to find desired tv by choosing different options.
  By choosing options user is getting search results displayed in the middle of the page.

  Background: Open Which? television page
    Given I am on Which? television page
    And Page loads

  #Number of the results is displayed next to the screen size

  Scenario Outline: Get correct search results for screen size
    When I select "<screen size>"
    Then I see the same number of the results displayed

    Examples:
      | screen size |
      | 17-22       |
      | 24-32       |
      | 39-46       |
      | 47-50       |
      | 51-55       |
      | 60-65       |

  @Ignore
  Scenario Outline: Get correct search results for screen size and brand
    When I select "<screen size>"
    And I select "<brand>"
    And I see number of results next the the brand option
    Then I see that many results displayed

    Examples:
      | screen size | brand     |
      | 17-22       | Samsung   |
      | 24-32       | LG        |
      | 39-46       | Panasonic |
      | 47-50       | Toshiba   |
      | 51-55       | Philips   |
      | 60-65       | Sony      |
