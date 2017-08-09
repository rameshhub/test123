package One.JenkinsTestPro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public static WebDriver driver;
  @Test
  public void semi() {
	  
	  driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver=new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
