package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.Browser;


public class HomePage {
	private WebElement signUpButton = Browser.Driver().findElement(By.xpath("//*[text()='Sign up']"));
    private WebElement userName = Browser.Driver().findElement(By.cssSelector("[placeholder='Username']"));
    private WebElement emailId = Browser.Driver().findElement(By.cssSelector("[placeholder='Email']"));
    private WebElement password = Browser.Driver().findElement(By.cssSelector("[placeholder='Password']"));
    private WebElement finalSignUpButton = Browser.Driver().findElement(By.xpath("//button[text()=' Sign up ']"));
    
    private WebElement newPostIcon = Browser.Driver().findElement(By.xpath("//*[contains(text(), 'New Post')]"));
    private WebElement articleTitle = Browser.Driver().findElement(By.cssSelector("[placeholder='Article Title']"));
    private WebElement articleDescription = Browser.Driver().findElement(By.cssSelector("input[placeholder$='about?']"));
    private WebElement bbNewArticle = Browser.Driver().findElement(By.cssSelector("textarea[placeholder*='(in markdown)']"));
    private WebElement enterTags = Browser.Driver().findElement(By.cssSelector("[placeholder='Enter Tags']"));
    private WebElement publishArticle = Browser.Driver().findElement(By.xpath("//button[text()=' Publish Article ']"));
    
    private WebElement deleteArticleIcon = Browser.Driver().findElement(By.cssSelector("div.article-actions button:nth-child(2) > i[class='ion-trash-a']"));
    private WebElement bbHomepageTxt = Browser.Driver().findElement(By.xpath("//app-home/div/div/div/p"));

    public HomePage(){ }

    public WebElement getSignUpButton() {
        return signUpButton;
    }
    
    public WebElement getUserName() {
        return userName;
    }
    
    public WebElement getEmailId() {
        return emailId;
    }
    
    public WebElement getPassword() {
        return password;
    }
    
    public WebElement getFinalSignUpButton() {
        return finalSignUpButton;
    }
    
    
    public WebElement getNewPostICon() {
        return newPostIcon;
    }
    
    public WebElement getArticleTitle() {
        return articleTitle;
    }
    
    public WebElement getArticleDescription() {
        return articleDescription;
    }
    
    public WebElement getBBNewArticle() {
        return bbNewArticle;
    }
    
    public WebElement getNewTagsLocator() {
        return enterTags;
    }
    
    public WebElement getPublishArticle() {
        return publishArticle;
    }
    
    
    public WebElement getDeleteIconArticle() {
        return deleteArticleIcon;
    }
    
    public WebElement getHomepageTxt() {
        return bbHomepageTxt;
    }
    
    
}
