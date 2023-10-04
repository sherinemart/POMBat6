package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactory.LoginPageObj;

public class LoginTestcase {
	WebDriver d;
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome96\\chromedriver.exe");
	  d=new ChromeDriver();
		
	  d.manage().window().maximize();
	  
	  d.get("https://www.phptravels.net/login");
	  
	  PageFactory.initElements(d,LoginPageObj.class);
	  
	  LoginPageObj.email.sendKeys("user@phptravels.com");
	  LoginPageObj.pswd.sendKeys("demouser");
	  LoginPageObj.submit.click();
	    
	  /*
	  LoginPageObj.email(d).sendKeys("user@phptravels.com");
	  LoginPageObj.pswd(d).sendKeys("demouser");
	  LoginPageObj.submit(d).click();
	  */	  
  }
}
