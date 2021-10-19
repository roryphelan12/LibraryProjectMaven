Feature: Is the name Tennet?
People want to know if the film is called Tennet

  Scenario: Tennet is the name
    Given The DVD is called Tennet
    When I ask whether name is Tennet
    Then I should be told "Yes"

  Scenario: Mars is the name
    Given The DVD is called Mars
    When I ask whether name is Tennet
    Then I should be told "No"