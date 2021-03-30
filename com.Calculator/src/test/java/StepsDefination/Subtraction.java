package StepsDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ButtonPage;

public class Subtraction {
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
		bp.two_M();// 234823 
		bp.three_M();
		bp.four_M();
		bp.eight_M();
		bp.two_M();
		bp.three_M();
	}

	@And("^user click on minus button$")
	public void user_click_on_minus_button() throws Throwable {
		ButtonPage bp=new ButtonPage(driver);
	   bp.sub_M();
	}
	
	@And("^user pass num2$")
	public void user_pass_num2() throws Throwable {
		ButtonPage bp=new ButtonPage(driver);
		bp.sub_M();
        bp.two_M();//-23094823
        bp.three_M();
        bp.zero_M();
        bp.nine_M();
        bp.four_M();
        bp.eight_M();
        bp.two_M();
        bp.three_M();
        
	}

	@When("^user click on equalto button$")
	public void user_click_on_equalto_button() throws Throwable {
		ButtonPage bp=new ButtonPage(driver);
	 bp.equal_M();
	}
	@Then("^user should get result of Subtraction$")
	public void result_of_subtraction() {
		ButtonPage bp=new ButtonPage(driver);
		String result=bp.getResult();
		Assert.assertEquals(result, "23329646");
		
		System.out.println("Result of Subtraction of two numbers is :"+result);
		
	}
	
*/
}
