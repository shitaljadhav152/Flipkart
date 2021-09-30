Feature: Manage feature

Background: user is successfully logged in
Given user opens "chrome" browser and exe "D:\Automation supportb tools\\chromedriver.exe"
Given user enters url "https://www.flipkart.com/"
Given user cancle the initial login window
Given user move on Login button
When user click on my profile
When user enter "9168313434" as  username
When user enter "DDDD@1234" as  password
When user click on Login button

@SmokeTest
Scenario: Manage address functionality 
When user click on manage address
When user click on ADD A NEW ADDRESS
When user enter "Ganesh" as name
When user enter "9309146478" as mobile number
When user enter "411052" as pincode
When user enter "Karve Nagar" as locality
When user enter "near cummins college" as address
When user click on Save button
Then validate address is added successfully

@RegresionTest
Scenario: Manage address functionality 
When user click on manage address
When user click on ADD A NEW ADDRESS
When user enter "Ganesh" as name
When user enter "930914647" as mobile number
When user enter "411052" as pincode
When user enter "Karve Nagar" as locality
When user enter "near cummins college" as address
When user click on Save button
Then validate address is added successfully