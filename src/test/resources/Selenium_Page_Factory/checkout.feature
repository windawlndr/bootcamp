  Feature: checkout flow
  Background:
  Given the url "https://www.saucedemo.com/" for checkout flow
  Then Open the browser for checkout flow
  And init all pages for run automation for checkout flow

  Scenario: 
  When Input username "standard_user" and "secret_sauce" in login page for checkout flow
  Then click login button for checkout flow
  Then click button add to cart 
  Then click cart button for checkout flow
  Then click checkout button for checkout flow
  Then Input first name "John" and last name "Doe" and zip code "12345" in checkout page for checkout flow
  Then click continue button for checkout flow
  Then click finish button for checkout flow
