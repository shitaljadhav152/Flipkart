Feature: Login feature

Background: user is successfully logged in
Given user opens "chrome" browser and exe "D:\Automation supportb tools\\chromedriver.exe"
Given user enters url "https://www.flipkart.com/"
Given user cancle the initial login window
Given user move on Login button


@SmokeTest
Scenario: login functionality with valid username and valid password
When user click on my profile
When user enter "9168313434" as  username
When user enter "DDDD@1234" as  password
When user click on Login button
Then validate Login page

@SmokeTest
Scenario: login functionality with valid username and invalid password
When user click on my profile
When user enter "9168313434" as  username
When user enter "DDDD@123" as  password
When user click on Login button
Then validate Login page

@SmokeTest
Scenario: login functionality with invalid username and valid password
When user click on my profile
When user enter "916831343" as  username
When user enter "DDDD@1234" as  password
When user click on Login button
Then validate Login page