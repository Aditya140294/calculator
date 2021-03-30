Feature: Addition Feature
Scenario: Addition feature
 Given when user open "chrome" browser
 When user pass "https://www.calculator.net/" as url
 And user pass num1
 And user click on Plus button
 And user pass num2
 When user click on equalto button 
 Then user should get result of addition