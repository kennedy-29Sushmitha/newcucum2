package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class searcase3 {
	WebDriver driver;
	@Given("user opens login page in TestMee application")
	public void user_opens_login_page_in_TestMee_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("userr enters un as {string}")
	public void userr_enters_un_as(String string) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	}

	@When("userr enters pd  as {string}")
	public void userr_enters_pd_as(String string1) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string1);
	}

	@When("click signin button")
	public void click_signin_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@When("userr searches for headphones in sb as {string}")
	public void userr_searches_for_headphones_in_sb_as(String string) {

		Actions actions=new Actions(driver);
		WebElement fin=driver.findElement(By.id("myInput"));
		fin.sendKeys("head");
		actions.sendKeys(fin,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("userr selects headphones from suggestion list")
	public void userr_selects_headphones_from_suggestion_list() {
	  
	}

	@When("userr clicks on find button")
	public void userr_clicks_on_find_button() {

	}

	@Then("verify loginn succes")
	public void verify_loginn_succes() {
		String b=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4")).getText();
		Assert.assertEquals("Headphone", b);

		driver.close();

	}

}
