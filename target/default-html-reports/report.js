$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/jenkins.feature");
formatter.feature({
  "name": "various actions",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user go to jenkins remote activate page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestJenkins.stepdefinitions.normal.user_go_to_jenkins_remote_activate_page()"
});
formatter.result({
  "status": "passed"
});
});