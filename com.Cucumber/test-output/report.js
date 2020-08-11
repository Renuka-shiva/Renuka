$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "NewTours Login feature",
  "description": "",
  "id": "newtours-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "NewTours Login test scenario",
  "description": "",
  "id": "newtours-login-feature;newtours-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title name is NewTours",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters username  and password",
  "rows": [
    {
      "comments": [
        {
          "line": 7,
          "value": "#DataTable concept"
        }
      ],
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "renukamohan58@gmail.com",
        "08062008"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginstepDefinition.user_is_already_login_page()"
});
formatter.result({
  "duration": 13243445102,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.title_name_is_NewTours()"
});
formatter.result({
  "duration": 26095220,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 775388397,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_clicks_Login_button()"
});
formatter.result({
  "duration": 132947185,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefinition.user_on_home_page()"
});
formatter.result({
  "duration": 7082211142,
  "status": "passed"
});
});