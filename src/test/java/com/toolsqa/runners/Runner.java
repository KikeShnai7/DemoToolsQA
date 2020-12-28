package com.toolsqa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/resources/features/Login.feature"},
		strict = false, plugin = {"pretty",
								  "json:target/cucumber_json_reports/ToolsQA.json",
								  "html:target/ToolsQA-html"},
		glue = {"com.toolsqa.hooks",
				"com.toolsqa.methods",
				"com.toolsqa.pages",
			   	"com.toolsqa.steps"})

public class Runner { }