@tag
Feature: EDIT GIFT VOUCHER
  
    Given User in the EDIT GIFT VOUCHER

  @hello
  Scenario: Add gift voucher, and sent to others
    Given User in the EDIT GIFT VOUCHER
    When edit the gift card code which has consist of 3-10 digits numeric and alphapets
    And edit the sender name
    And edit your email address
    And edit receiptant name
    And edit receiptant email address
    And edit the theme
    And edit the written message
    And edit the give amount
    And edit the status
    Then Click the save button. It should navigate to the Voucher list page

  @edit_with_back
  Scenario: Add gift voucher, and sent to others
    When edit the gift card code which has consist of 3-10 digits numeric and alphapets
    And edit the sender name
    And edit your email address
    And edit receiptant name
    And edit receiptant email address
    And edit the theme
    And edit the written message
    And edit the give amount
    And edit the status
    Then on clicking the back icon, it should be the same data in the voucher page
