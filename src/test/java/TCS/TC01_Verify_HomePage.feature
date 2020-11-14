Feature: Verify the home page
  @Homepage
  Scenario: Verify the page title
    Given a website to test
    Then Verify the page title "ToolsQA"
    And Verify for the categories