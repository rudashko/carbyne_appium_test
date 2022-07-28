# CARBYNE_APPIUM



## Test project


### Questions section
#### What are the mobile application types you are familiar with?

There are two types of applications: native (Swift/Object-C and Java/Kotlin) and hybrid apps (React Native, Unity etc)

---------
#### Given the fact that an application has the same pages and same funcionallity for iOS and Android, build a class structure of how you would build the infrastructure.(testbase, pages, classes/interfaces etc.)
 
Here is my explanation of the project structure:

Stack: Java + Appium + Maven + TestNG + Allure Reports
Pattern: PageFactory

- App resources are in "app" package.
- Screens' locators and action over them are in "screens" package.
- Tests are in "tests".
- "utils" package for classes with common useful methods for whole app.
- "Regression.xml" and "Smoke.xml" are used by TestNG.