package pagefactory;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//import org.testng.annotations.Test;

public class LoginPageObj {
	
	@FindBy(how=How.NAME,using="email")
	public static WebElement email;
	

	@FindBy(name="password")
	public static WebElement pswd;
	

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement submit;


	
	
	/*
	
	public static WebElement email(WebDriver d)
	{
		return d.findElement(By.name("email"));
	}
	
	
	public static WebElement pswd(WebDriver d)
	{
		return d.findElement(By.name("password"));
	}
	
	public static WebElement submit(WebDriver d)
	{
		return  d.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		
	}
	*/
/*	
  WebDriver d;
  @Test
  public void f() {
	  
	 
	  d.findElement(By.name("email")).sendKeys("user@phptravels.com");
	  d.findElement(By.name("password")).sendKeys("demouser");
	  d.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
	  
  } */
}
