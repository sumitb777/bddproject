Feature: qa fox

  Background: open chrome browser
     open "http://omayo.blogspot.com" website


  Scenario: dropdown selection
    Given dropdown webelement
    When select swift
    Then swift shoul selected
