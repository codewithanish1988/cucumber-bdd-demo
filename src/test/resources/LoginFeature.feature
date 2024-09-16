Feature: Login Management
  Scenario: Successful User Login
    Given A user with username "anish" and password "anish123"
    When The user clicks login Button
    Then The response should be "Welcome"

  Scenario: Invalid User login
    Given A user with username "unknownuser" and password "anypassword"
    When The user clicks login Button
    Then The response should be "Invalid credentials"
