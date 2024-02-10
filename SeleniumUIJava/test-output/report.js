$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/rajeshwarimahadevan/eclipse-workspace/SeleniumUIJava/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Orange HRMS login steps",
  "description": "",
  "id": "login-feature;orange-hrms-login-steps",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is OrangeHRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "logintest.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 4394958969,
  "status": "passed"
});
formatter.match({
  "location": "logintest.title_of_login_page_is_OrangeHRM()"
});
formatter.result({
  "duration": 1012930823,
  "status": "passed"
});
formatter.match({
  "location": "logintest.user_enters_username_and_password()"
});
formatter.result({
  "duration": 436132095,
  "status": "passed"
});
});