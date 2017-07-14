$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Feature_File/Login.feature");
formatter.feature({
  "line": 1,
  "name": "User will login in the ERP",
  "description": "",
  "id": "user-will-login-in-the-erp",
  "keyword": "Feature"
});
formatter.before({
  "duration": 197938,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login page",
  "description": "",
  "id": "user-will-login-in-the-erp;login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Enter Url",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter Username and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_def.enter_Url()"
});
formatter.result({
  "duration": 3168362479,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.enter_Username_and_Password()"
});
formatter.result({
  "duration": 196548203,
  "status": "passed"
});
formatter.match({
  "location": "Step_def.click_on_login_button()"
});
formatter.result({
  "duration": 734529053,
  "status": "passed"
});
formatter.after({
  "duration": 71844,
  "status": "passed"
});
});