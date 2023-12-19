@regression @Disha
Feature: Country Drop Down List
  Scenario: Verify the following country available in country dropdown list
  Given I am on homepage
  When I click on Accept All cookies button
  And I click on StartNow button
  Then I can see following country into dropdown list
|albania   |bhutan    |british-protected-person|haiti    |kazakhstan|
|mozambique| norway   | portugal               | russia  | zambia   |