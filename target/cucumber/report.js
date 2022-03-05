$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginDataFromDB.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios other login functionality validation driving data from MySQL database",
  "description": "",
  "id": "techfios-other-login-functionality-validation-driving-data-from-mysql-database",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbLogin"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 2796758000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-other-login-functionality-validation-driving-data-from-mysql-database;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@DbScenario1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enter \"username\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enter \"password\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User click on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 12
    }
  ],
  "location": "LoginStepDefinition.user_enter_from_mysql_database(String)"
});
formatter.result({
  "duration": 2282700,
  "error_message": "java.lang.NullPointerException\r\n\tat steps.LoginStepDefinition.user_enter_from_mysql_database(LoginStepDefinition.java:55)\r\n\tat ✽.When User enter \"username\" from mysql database(features/LoginDataFromDB.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 12
    }
  ],
  "location": "LoginStepDefinition.user_enter_from_mysql_database(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_on_Signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 635916300,
  "status": "passed"
});
});