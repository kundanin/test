package test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.sba.ClearTrip;

import setup.browser.BrowserSetup;
import utility.TestData;

public class TestRunner {  
  @Test
  public void f() throws IOException {
	  
//	  ClearTrip ct=PageFactory.initElements(driver, ClearTrip.class);
//	  ct.searchFlight();
	  System.out.println("f");
	  TestRunner tr=new  TestRunner();
	  tr.g();
  }
public void g() throws IOException {
	  
//	  ClearTrip ct=PageFactory.initElements(driver, ClearTrip.class);
//	  ct.searchFlight();
	  System.out.println("g");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
	 
  }

}
