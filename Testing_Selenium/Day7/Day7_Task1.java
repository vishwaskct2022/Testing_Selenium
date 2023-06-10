package com.testing.test7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_Task1
{
	  @Test
	  public void f() {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		  driver.manage().window().maximize();
		  String actualtitle = driver.getTitle();
		  Assert.assertEquals(actualtitle, "Guest Registration Form – User Registration");
		  driver.close();
	  }

}
