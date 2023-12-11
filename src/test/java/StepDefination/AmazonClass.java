package StepDefination;

import java.util.Set;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonClass extends BaseClass{
	
	public static String parentid;
	public static Set<String>allwindow;
	
	@Given("User open the appllication")
	public void user_open_the_appllication() {
		BaseClass.initilazation();
	}
	@When("user search iphone product and click on Iphone15 Pro Max")
	public void user_search_iphone_product_and_click_on_iphone15_pro_max() {
	   
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone15ProMax");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Then("User Select Iphone15 Pro Max Natural titanium")
	public void user_select_iphone15_pro_max_natural_titanium() {
		
		 parentid=driver.getWindowHandle();
			driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
			
	    
	}
	@Then("User Captured the price of the iphone")
	public void user_captured_the_price_of_the_iphone() {
		
Set<String>allwindow=driver.getWindowHandles();
		
		String Childwinid=null;
		for(String abc:allwindow)
		{
			if (!(abc.equalsIgnoreCase(parentid)))
			{
				Childwinid=abc;
			}
		}
		
		driver.switchTo().window(Childwinid);
		
		
		
		String captureprice=driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")).getText();
		
	   
	}
	@Then("Click on add to cart and then click on proceed to checkout")
	public void click_on_add_to_cart_and_then_click_on_proceed_to_checkout() {
	   
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[36]")).click();
	    
	}
	@Then("Click on create new account button")
	public void click_on_create_new_account_button() {
	   
		driver.findElement(By.id("createAccountSubmit")).click();
	}
	@Then("user enter {string} ,{string},{string}")
	public void user_enter(String Firstname, String mobileno, String Password) {
	   
	    driver.findElement(By.id("ap_customer_name")).click();
	    driver.findElement(By.id("ap_customer_name")).sendKeys(Firstname);
	    driver.findElement(By.id("ap_phone_number")).click();
	    driver.findElement(By.id("ap_phone_number")).sendKeys(mobileno);
	    driver.findElement(By.id("ap_customer_name")).click();
	    driver.findElement(By.id("ap_password")).sendKeys(Password);
	}
	@Then("Click On Verify Mobile Number")
	public void click_on_verify_mobile_number() {
	   driver.findElement(By.id("continue")).click();
	}

}
	