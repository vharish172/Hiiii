@tag
Feature: ADD GIFT VOUCHER

  

  @Run
  Scenario: Add gift voucher, and sent to others
    Given User in the ADD GIFT VOUCHER
    When Write a gift card code which has consist of 16 digits numeric and alphapets
    And write sender name
    And write your email address
    And write receiptant name
    And write receiptant email address
    And choose the theme
    And user can also write some message
    And Enter the amount
    And Choose the status
    Then clicking the save the button will take to the gift vocuher window
