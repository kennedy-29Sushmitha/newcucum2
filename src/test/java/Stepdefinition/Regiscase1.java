package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Regiscase1 {
	WebDriver driver;
	@Given("user opens Register page in TestMe application")
	public void user_opens_Register_page_in_TestMe_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");

	}

	@When("user enter username as {string} and firstname as {string}")
	public void user_enter_username_as_and_firstname_as(String string, String string2) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(string2);
	}

	@When("user enters lastname as {string}")
	public void user_enters_lastname_as(String string) {
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(string);
	}

	@When("user enters conpasswd as {string}")
	public void user_enters_conpasswd_as(String string) {
		driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys(string);
	}

	@When("user enters gender as {string}")
	public void user_enters_gender_as(String string) {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
	}

	@When("user enters email as {string}")
	public void user_enters_email_as(String string) {
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(string);
	}

	@When("user enters mobileno as {string}")
	public void user_enters_mobileno_as(String string) {
		driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(string);
	}

	@When("user enters dob as {string}")
	public void user_enters_dob_as(String string) {
		driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(string);
	}

	@When("user enters address as {string}")
	public void user_enters_address_as(String string) {
		Select qn=new Select(driver.findElement(By.xpath("//*[@id='securityQuestion']")));
		qn.selectByIndex(0);

	}

	@When("user selects secquestion as {string}")
	public void user_selects_secquestion_as(String string) {

	}

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String string) {
		driver.findElement(By.xpath("//*[@id=\'answer\']")).sendKeys(string);
	}

	@When("click Register button")
	public void click_Register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		driver.close();

	}

	@Then("verify register process")
	public void verify_register_process() {
		System.out.println("Regsitered successfully");

	}

}
