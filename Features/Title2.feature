@feature2
Feature: Page Title

@test2
Scenario: Verify the page title
	Given I am on Mercury Tours 
	When I get the page title
	Then I verify that the page title is "Duplicate Welcome: Mercury Tours"