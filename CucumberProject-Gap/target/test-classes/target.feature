@TargetTest
 Feature: Target Testing
 
 @TargetTest1
 Scenario: Login To target
 Given open Target browser
 And Login and Logout 
 Then close this browser