@GapTests
 Feature: Gap Testing
 
 @GapTest1
 Scenario: Introduce Gap Homepage
 Given open browser
 And click on item
 Then close browser
 
 
 @GapTest2
 Scenario: Buying my daughter a pair of jeans
 Given opens the browser
 And  goes to girl dropdown
 And select and click on jeans
 And select straight category
 And select high rise mom jeans
 And select proper size
 Then close Browser
 