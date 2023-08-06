Feature: customer page
  Scenario Outline: To enter the values in the fields of the customer page
    Given Given Open the login page and click login
    And  move to Customer page
    Then enter '<Email>' and '<Firstname>' and '<Lastname>' in the fields
    And search with given datas
    Examples:
      |Email                             |Firstname      |Lastname|
      |kiyjcycyhjc676008@gmail.com       |Virat          |Kohli   |
      |arthur_holmes@nopCommerce.com     |Arthur         |Holmes  |
      |brenda_lindgren@nopCommerce.com   |Brenda         |Lindgren|
