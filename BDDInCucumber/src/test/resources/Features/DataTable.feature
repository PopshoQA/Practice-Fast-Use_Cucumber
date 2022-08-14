Feature: Test the login funcionality of OrangeHRM Using DataTable

Scenario: Test the valid login using DataTable

Given user is on loginPage
When user enters credential using DataTable
| admin     | admin123  |
And click on login button
Then user should land on home page