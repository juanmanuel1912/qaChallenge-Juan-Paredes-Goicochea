@tagRegiLogi
Feature: Realize a Register and login on localhost
  Test Cases Happy path with Register and Login User

  @tagEviEjem33
  Scenario: Realice a Register with a one step
    Given start testing of evidence register
    And Open browser and website register
    And when open the website make register with user "tester@test.com" and password "tester123"
    When realize register in the website
    And Genered report of evidency "J:\\reto utp\\qa-challenge-Juan Paredes-word\\src\\test\\resources\\evidencias\\EvidenciaPrueba_Register.docx"
    Then  closed the browser

  @tagEviEjem22
  Scenario: Realice a login with a a one step
    Given start testing of evidence
    And Open browser and website login
    And when open the website make login with user "tester@test.com" and password "tester123"
    When realize login in the website
    And Genered report of evidency login "J:\\reto utp\\qa-challenge-Juan Paredes-word\\src\\test\\resources\\evidencias\\EvidenciaPrueba_Login.docx"
    Then  closed the browser login

