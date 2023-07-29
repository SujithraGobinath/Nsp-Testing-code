Feature:nopcommerce product page
  Scenario:Edit the product details
    Given open the login page
    Then click login
    Then  click the catalogue and click product field
    Then Enter the product name:"Adobe Photoshop CS4" and search
    And click edit
    Then change product type
    Then save
    Then check the product type is changed
    And Validate

