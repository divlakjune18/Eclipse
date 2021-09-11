Feature: Login1 feature

@validCredentials
Scenario Outline: Login with Valid credentials
Given Open browser
Then Enter url as <URL>
Then Enter valid username as <USERNAME>
Then Enter valid password as <PASSWORD>
And Click login

Examples:
| URL | USERNAME | PASSWORD |
| "https://opensource-demo.orangehrmlive.com/" | "Admin" | "admin123" |
