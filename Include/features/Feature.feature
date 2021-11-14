Feature: Hepsiburada

  Scenario Outline: select loc and categories
    Given I open app
    When I select location and save
    And I select Categories
    Then I close app

    Examples: 
      | email | pass |
      | x     | x    |

  Scenario Outline: Favorites
    Given I open app
    When I select SuperFiyat
    And I add Favorite
    And I login with "<email>" and as a password "<password>"
    And I return Favorite
    Then I close app

    Examples: 
      | email | password |
      | x     | x        |
