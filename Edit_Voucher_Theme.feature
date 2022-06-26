@tag
Feature: Edit Voucher theme

  @editV
  Scenario: edit the Voucher theme with name and image
    Given User should be navigated to the edit vocher theme using the url and credentials
    When edit the voucher theme name
    And choose the voucher image@add_voucher
    Then clicking on edit icon, it should be refelected in the voucher theme list

  @editV_back
  Scenario: edit the Voucher theme with image and name
    Given User should be navigated to the edit voucher theme using with the url and credentials
    When edit and enter the voucher theme name
    Then clicking on back icon, it should be navigate to the voucher theme list
