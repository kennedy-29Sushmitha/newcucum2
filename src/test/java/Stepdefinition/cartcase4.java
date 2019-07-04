package Stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class cartcase4 {
	WebDriver driver;
	@Given("user open login page in TestMee application")
	public void user_open_login_page_in_TestMee_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("userr enter un as {string}")
	public void userr_enter_un_as(String string) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	}

	@When("userr enter pd  as {string}")
	public void userr_enter_pd_as(String string) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
	}

	@When("click signinn button")
	public void click_signinn_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("userr searche for headphones in sb as {string}")
	public void userr_searche_for_headphones_in_sb_as(String string) {
		Actions actions=new Actions(driver);
		WebElement fin=driver.findElement(By.id("myInput"));
		fin.sendKeys("head");
		actions.sendKeys(fin,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("userr select headphones from suggestion list")
	public void userr_select_headphones_from_suggestion_list() {
	    
	}

	@When("userr click on find button")
	public void userr_click_on_find_button() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("click on cart button")
	public void click_on_cart_button() {
		int c=(driver.findElements(By.partialLinkText("cart"))).size();
		if(c>0)
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
	
		}
	}
	
	@Then("verify cart is empty or not")
	public void verify_cart_is_empty_or_not() {
		
	}



}
