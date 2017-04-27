package com.thetimes;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 4/27/2017.
 */
public class MyStepdefs {

    WebDriver driver;
    @Given("^user is on home page$")
    public void userIsOnHomePage()
    {
      driver= new FirefoxDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.get("https://www.thetimes.co.uk");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^user  Click on Subscripe the times services$")
    public void userClickOnSubscripeTheTimesServices()
    {
        Alert alert=driver.switchTo().alert();
       driver.findElement(By.className("CookieMessage-button")).click();
       driver.findElement(By.linkText("Subscribe")).click();

    }

    @And("^user select digital pack for (\\d+) weeks$")
    public void userSelectDigitalPackForWeeks(int arg0)
    {
      driver.findElement(By.linkText("View all Subscriptions")).click();
      driver.findElement(By.linkText("Digital Packs")).click();
      driver.findElement(By.xpath("(//a[contains(text(),'Viewfulldetails')])[2]")).click();

    }

    @Then("^user should get digital services subscriptin for  (\\d+) weeks$")
    public void userShouldGetDigitalServicesSubscriptinForWeeks(int arg0)
    {
        Assert.assertEquals(driver.findElement(By.cssSelector("div.productName")).getText(),"The Digital Pack");

    }
}
