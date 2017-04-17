@title
Feature: Page Title

@wip
Scenario: Verify the page title
	Given I am on Mercury Tours 
	When I get the page title
	Then I verify that the page title is "Welcome: Mercury Tours"
	
	
Scenario: Verify the page title again
	Given I am on Mercury Tours 
	When I get the page title
	Then I verify that the page title is "Welcome: Mercury Tours"