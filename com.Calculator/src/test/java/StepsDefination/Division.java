package StepsDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ButtonPage;

public class Division {
	/*WebDriver driver;
	@Given("^when user open \"(.*)\" browser$")
	public void when_user_open_browser(String arg1) throws Throwable {
     System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe" );
	 driver=new ChromeDriver();
	 
	}
	
	@When ("^user pass \"([^\"]*)\" as url$")
	public void user_pass_as_url(String url) {
		driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.MILLISECONDS);
	}
	

	@And("^user pass num1$")
	public void user_pass_num1() throws Throwable {
		ButtonPage bp=new ButtonPage(driver);
		bp.four_M();//4000
		bp.zero_M();
		bp.zero_M();
		bp.zero_M();
	}

	@And("^user click on division button$")
	public void user_click_on_Divide_button() throws Throwable {
		ButtonPage bp=new ButtonPage(driver);
	   bp.div_M();
	}
	
	@And("^user pass num2$")
	public void user_pass_num2() throws Throwable {
		ButtonPage bp=new ButtonPage(driver);
     bp.two_M();
     bp.zero_M();
     bp.zero_M();
	}

	@When("^user click on equalto button$")
	public void user_click_on_equalto_button() throws Throwable {
		ButtonPage bp=new ButtonPage(driver);
	 bp.equal_M();
	}
	@Then("^user should get result of division$")
	public void result_of_division() {
		ButtonPage bp=new ButtonPage(driver);
		String result=bp.getResult();
		
		System.out.println("Result of Division of two numbers is :"+result);
		
	}*/

}
