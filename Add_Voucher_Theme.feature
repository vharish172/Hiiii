Feature: Add Voucher Theme

  @addV
  Scenario: Add the Voucher theme with name and image
    Given User on the add voucher theme page using url and credentials
    When enter the add voucher theme name
    And choose the voucher image@add_voucher
    Then clicking on save icon, it should be refelected in the voucher theme list

  @add_voucher_back
  Scenario: Add the Voucher theme with name, image and cancel
    Given User on the add voucher theme page using with the url and credentials
    When Add the voucher theme name
    Then clicking on back icon, it should not be add any voucher in the voucher theme list
