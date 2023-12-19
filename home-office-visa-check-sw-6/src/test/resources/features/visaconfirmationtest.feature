@regression  @author_Disha
Feature: VisaConfirmationTest
  As a user, I want to verify that appropriate visa result is displayed as per different visa applications

 @smoke @sanity @regression
  Scenario: Verify that the visa result for an Australian coming to UK for Tourism
    Given I am on homepage
    When I click on Accept All cookies button
    And I click on StartNow button
    And I select a Nationality "Australia"
    And I click on Continue button after selecting Nationality
    And I select reason for visit "Tourism"
    And I click on Continue button after selecting reason
    Then I should get result message "You will not need a visa to come to the UK"

  @sanity @smoke @regression
  Scenario: Verify that visa result for a Chilean coming to UK for Work and plans on staying for Longer than Six Months
    Given I am on homepage
    When I click on Accept All cookies button
    And I click on StartNow button
    And I select a Nationality "Chile"
    And I click on Continue button after selecting Nationality
    And I select reason for "Work, academic visit or business"
    And I click on Continue button after selecting reason
    And I select intended to stay for "longer than 6 months"
    And I click on Continue button after selecting stay
    And I select planning to work for "Health and Care Professional"
    And I click on Continue button after selecting workType
    Then I should get result message for "You need a visa to work in health and care"

  @smoke @sanity @regression
  Scenario: Verify that visa result for a Cambodian coming to UK to join a partner doe a long stay
    Given I am on homepage
    When I click on Accept All cookies button
    And I click on StartNow button
    And I select a Nationality "Cambodia"
    And I click on Continue button after selecting Nationality
    And I select reason to "Join partner or family for a long stay"
    And I click on Continue button after selecting reason to join partner or family
    And I select state My partner of family member have uk immigration status "yes"
    And I click on Continue button after selecting status
    Then I should get result message that "You’ll need a visa to join your family or partner in the UK"
