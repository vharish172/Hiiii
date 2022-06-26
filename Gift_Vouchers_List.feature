Feature: Gift Voucher List

  @Gift
  Scenario: Delete the Gift Voucher
  	Given User in the  GIFT VOUCHER List
    When select the any of the gift voucher
    And click the delete icon
    And click ok for the confirm alert
    Then selected voucher will get deleted

  @gift_edit
  Scenario: For Edit the Gift Voucher
    When select the any of the gift voucher
    And clicking the edit icon
    Then it should take through the edit gift voucher page

  @gift_add
  Scenario: For Add the Gift Voucher
    When select the any of the gift voucher
    And clicking the Add icon
    Then it should take through the add gift voucher page
