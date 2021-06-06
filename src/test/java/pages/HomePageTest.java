package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Browser;

public class HomePageTest extends TestBase{

	WebDriver driver;
	
	@BeforeTest
	public void intializeDriver() {
		driver = Browser.Driver();
	}
	
    @Test
    public void testH1Existing() throws InterruptedException {
        Assert.assertTrue(Browser.getTitle() != null);
    }

    @Test
    public void signUp() throws InterruptedException {
    	driver.findElement(By.xpath("//*[text()='Sign up']")).click();
    	
    	driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("BackbaseUser");
    	driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("BackbaseUser@Yahoo.com");
    	driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("BackbasePassword");
    	
    
    }
    
    
    @Test
    public void createNewPost() throws InterruptedException {
    	driver.findElement(By.xpath("//*[contains(text(), 'New Post')]")).click();
    	
    	driver.findElement(By.cssSelector("[placeholder='Article Title']")).sendKeys("BackBase New Article");
    	driver.findElement(By.cssSelector("input[placeholder$='about?']")).sendKeys("BackBase Article Description");
    	driver.findElement(By.cssSelector("textarea[placeholder*='(in markdown)']")).sendKeys("BackBase New Article");
    	driver.findElement(By.cssSelector("[placeholder='Enter Tags']")).sendKeys("BackBase New Article");
    	driver.findElement(By.xpath("//button[text()=' Publish Article ']")).click();
    	
    	
    
    }
}
