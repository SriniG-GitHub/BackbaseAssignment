package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Browser;

public class BBHomePageTest extends Browser {

	public static HomePage bbHomePageObj;
	
	@BeforeTest
	public void driverInitialzation() {
		Browser.Initialize();
	}


	@Test
	public void signUp() throws InterruptedException {
		bbHomePageObj = new HomePage();
		
		bbHomePageObj.getSignUpButton().click();
		bbHomePageObj.getUserName().sendKeys("BackbaseUser");
		bbHomePageObj.getEmailId().sendKeys("BackbaseUser@Yahoo.com");
		bbHomePageObj.getPassword().sendKeys("BackbasePassword");
		bbHomePageObj.getFinalSignUpButton().click();

	}

	@Test(dependsOnMethods = "signUp")
	public void createNewPost() throws InterruptedException {
		bbHomePageObj = new HomePage();
		bbHomePageObj.getNewPostICon().click();

		bbHomePageObj.getArticleTitle().sendKeys("BackBase New Article");
		bbHomePageObj.getArticleDescription().sendKeys("BackBase Article Description");
		bbHomePageObj.getBBNewArticle().sendKeys("BackBase New Article");
		bbHomePageObj.getNewTagsLocator().sendKeys("@BackBase @New @Article");
		bbHomePageObj.getPublishArticle().click();
	}

	@Test(dependsOnMethods = "createNewPost")
	public void deleteArticle() throws InterruptedException {
		bbHomePageObj = new HomePage();
		bbHomePageObj.getDeleteIconArticle().click();
		
		String BBHomepageTxt = bbHomePageObj.getHomepageTxt().getText();
		Assert.assertEquals(BBHomepageTxt, "A place to share your knowledge.");
	}

	@AfterTest
	public void tearDown() {
		Browser.close();
	}

}
