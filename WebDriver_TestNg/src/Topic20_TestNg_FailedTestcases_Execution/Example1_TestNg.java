package Topic20_TestNg_FailedTestcases_Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example1_TestNg {
	
	public WebDriver driver;
	String baseurl="https://www.linkedin.com/";
	
	@BeforeClass
	public void Setup(){
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void verifyLoginPageText(){
		driver.get(baseurl);
		System.out.println("==>Verify login page Text <==");
		WebElement element=driver.findElement(By.xpath("//body[@id='pagekey-uno-reg-guest-home']//div/h2"));
		String pagetext=element.getText();
		System.out.println(pagetext);
		Assert.assertEquals(pagetext, "Get started - it's free.");
		
	}
	
	@Test(priority=2)
	public void VerifyForgotPassword(){
		driver.get(baseurl);
		System.out.println("==>Verify Forgot password <==");
		WebElement element= driver.findElement(By.linkText("Forgot password?"));
		element.click();
		WebElement pagetext=driver.findElement(By.xpath("//form[@id='PWResetForm']//div//label"));
		String pagetitle=pagetext.getText();
		System.out.println(pagetitle);
		Assert.assertEquals("Enter the email address or phone number associated with you",pagetitle);
	
		
		
	}

}
