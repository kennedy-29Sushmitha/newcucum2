package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logincase2 {
	WebDriver driver;
	@Given("user opens login page in TestMe application")
	public void user_opens_login_page_in_TestMe_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");

	}

	@When("user enters un as {string}")
	public void user_enters_un_as(String string) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	}

	@When("user as {string}")
	public void user_as(String string) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
	}

	@When("click Signin button")
	public void click_Signin_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("verify loginn success")
	public void verify_loginn_success() {
		System.out.println("Logged in successfully");
	}
}
