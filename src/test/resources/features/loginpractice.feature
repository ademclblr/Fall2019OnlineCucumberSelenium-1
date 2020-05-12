@login
Feature Login
  As a user, I should be able to login

  Background:Able to login
    Given user is on the login page

  @POS
  Scenario Outline: As a POS user, I should be able to login
    Then user enter "<username>" and "<password>"

    Examples:
      | username                    | password         |
      | posmanager94@info.com       | posmanager       |
      | posmanager95@info.com       | posmanager       |
      | posmanager96@info.com       | posmanager       |
      | posmanager97@info.com       | posmanager       |
      | posmanager98@info.com       | posmanager       |
      | imm45@info.com              | inventorymanager |
      | imm45@info.com              | inventorymanager |
      | imm45@info.com              | inventorymanager |
      | imm45@info.com              | inventorymanager |
      | eventscrmmanager50@info.com | eventscrmmanager |
      | eventscrmmanager51@info.com | eventscrmmanager |
  @CRM
  Scenario Outline: As a CRM user, I should be able to login
    Then user enter "<username>" and "<password>"

    Examples:
      | username                    | password         |


  @contacts
  Scenario Outline: As a contact user, I should be able to login
    Then user enter "<username>" and "<password>"

    Examples:
      | username       | password         |

