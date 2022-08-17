package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"com.StepDefinition"},
monochrome=true,
plugin= {"html:Reports\\HTMLReports",
		 "json:Reports\\JsonReports\\cucumber.json", 
		 "junit:Reports\\JUnitReport\\Cucumber.xml"},
dryRun=false,  //Mapping between feature file and step file
strict=true,  //It will check if any step is not defined in step defined file
tags = "@FunctionalTest and @SmokeTest")

public class Runner {

}