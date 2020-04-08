$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/test.feature");
formatter.feature({
  "line": 1,
  "name": "Crossword Loginpage",
  "description": "This feature verifies the fuctionality on  OrangeHrmdemo Loginpage",
  "id": "crossword-loginpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Check that main elements on  Crossword Loginpage are displayed",
  "description": "",
  "id": "crossword-loginpage;check-that-main-elements-on--crossword-loginpage-are-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tc_01_Register"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Login Crossword login page opened",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close the browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});