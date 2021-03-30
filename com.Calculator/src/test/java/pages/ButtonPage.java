package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {
	public WebDriver ldriver;
	 
	public ButtonPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath = "//span[@onclick=\"r(0)\"]")
	@CacheLookup
	WebElement zero;
	
	@FindBy(xpath = "//span[@onclick=\"r(1)\"]")
	@CacheLookup
	WebElement one;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")
	@CacheLookup
	WebElement two;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")
	@CacheLookup
	WebElement three;
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")
	@CacheLookup
	WebElement lfour;
	
	@FindBy(xpath = "//span[@onclick=\"r(5)\"]")
	@CacheLookup
	WebElement five;
	
	
	
	@FindBy(xpath = "//span[@onclick=\"r(6)\"]")
	@CacheLookup
	WebElement six;
	
	@FindBy(xpath = "//span[@onclick=\"r(7)\"]")
	@CacheLookup
	WebElement sevan;
	
	@FindBy(xpath = "//span[@onclick=\"r(8)\"]")
	@CacheLookup
	WebElement eight;
	
	@FindBy(xpath = "//span[@onclick=\"r(9)\"]")
	@CacheLookup
	WebElement nine;
	
	@FindBy(xpath = "//span[@onclick=\"r('+')\"]")
	@CacheLookup
	WebElement add;
	
	@FindBy(xpath = "//span[@onclick=\"r('-')\"]")
	@CacheLookup
	WebElement sub;
	
	
	@FindBy(xpath = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")
    @CacheLookup
	WebElement mul;
	
	
	@FindBy(xpath = "//span[@onclick=\"r('/')\"]")
	@CacheLookup
	WebElement div;
	
	
	@FindBy(xpath = "//span[@onclick=\"r('=')\"]")
	@CacheLookup
	WebElement equalto;
	
	@FindBy(xpath = "//*[@id=\"sciOutPut\"]")
	@CacheLookup
	WebElement result;
	

	public void zero_M() {
		zero.click();
	}
	
	public void one_M() {
		one.click();
	}
	
	public void two_M() {
		two.click();
	}
	
	public void three_M() {
		three.click();
	}
	public void four_M() {
		lfour.click();
	}
	public void five_M() {
		five.click();
	}
	public void six_M() {
		six.click();
	}
	public void sevan_M() {
		sevan.click();
	}
	public void eight_M() {
		eight.click();
	}
	public void nine_M() {
		nine.click();
	}
	public void add_M() {
		add.click();
	}
	public void sub_M() {
		sub.click();
	}
	public void mul_M() {
		mul.click();
	}
	public void div_M() {
		div.click();
	}
	public void equal_M() {
		equalto.click();
	}
	public String getResult() {
		String res=result.getText();
		return res;
	}


}
