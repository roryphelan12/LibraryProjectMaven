Feature: Is the book index 123
  People want to know if a DVD has an index number 123

  Scenario: Index is 123
    Given The book has an index of 123
    When I ask whether the book has an index of 123
    Then I should be told "Yes"

