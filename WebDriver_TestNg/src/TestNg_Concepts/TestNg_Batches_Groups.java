package TestNg_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNg_Batches_Groups {
	
	public WebDriver driver;
	@Test(groups={"p1","browser"})
	public void launchbrowser(){
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=3LSEVpv1J8yD8Qf1jrGoBA&gws_rd=ssl");
	}
	@Test(groups={"p2","search data"},dependsOnMethods="launchbrowser")
	public void EnterToSearch(){
		
		driver.findElement(By.id("lst-ib")).sendKeys("abdul kalam");
		
		Actions actn= new Actions(driver);
		actn.sendKeys(Keys.DOWN).build().perform();
		actn.sendKeys(Keys.ENTER).build().perform();
		
	}

}
