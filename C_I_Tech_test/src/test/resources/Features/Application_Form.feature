Feature: Application form Test

  Background: 
    Given I am on the navigating to the LV homepage
    And I click on More on life insurance button
    Then I click on the Types of life insurance.
    When I click on the Get life insurance quote button
    And I fill the form with details

  Scenario: Given the user navigate to the LV homepage
    When the More on life insurance button is selected
    Then user can select the Type of life insurance 
    When the user selects the Get life insurance quote
    Then the user provides the form with the data.
    

  @home
  Scenario Outline: A LV homepage URL is launched
    When the More on life insurance button "<More on life insurance>" is selected
    When Type of life insurance button "<Type of life insurance> is selected
    When "<Insures only you and pays out if there is a claim during the plan term>" is asserted 
    When the Get life insurance "<Get Life insurance>" quote is selected
    Then the data is provided in the form

    Examples: 
      | firstname | surname | email            | confirmemail     | tel       | postcode |
      | Mike      | Kenny   | mike11@gmail.com | mike11@gmail.com | 000000000 | AA11 2AA |