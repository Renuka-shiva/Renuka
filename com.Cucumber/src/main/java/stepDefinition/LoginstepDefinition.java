package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginstepDefinition {
	
	
	WebDriver driver=null;
	
	@Given("^User is already login page$")
	public void user_is_already_login_page()   {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");// get rid of warnings in console part...
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siva\\Desktop\\NewTours\\com.Cucumber\\driverFiles\\chromedriver.exe");
		driver = new  ChromeDriver();
		driver.get("https://www.facebook.com");
	     
	}

	@When("^Title name is NewTours$")
	public void title_name_is_NewTours()   {
		
		String Title=driver.getTitle();
		System.out.println(Title);
	//Assert.assertEquals("Go to Facebook home", Title);
		
	     
	}
	
	//Reg Exp:
//		 //1. \"([^\"]*)\"
//		 //2. \"(.*)\"

	@Then("^user enters username  and password$")
	public void user_enters_username_and_password(DataTable credit)   { 
	//Map<String,String>	data=(Map<String,String>)credentials.asMap(String.class, String.class);
		 for(Map<String,String>	data: credit.asMaps(String.class, String.class))
		 {
		 driver.findElement(By.name("email")).sendKeys(data.get("username"));;
		 driver.findElement(By.name("pass")).sendKeys(data.get("password"));;
		
		 }
		
		
	     
	}

	@Then("^user clicks Login button$")
	public void user_clicks_Login_button()   {
	     driver.findElement(By.id("loginbutton")).click();
	}

      @Then("^user on home page$")
       public void user_on_home_page()  {
	String ttl=driver.getTitle();
	System.out.println("home title: "+ ttl);
	
		driver.quit();
	     
	}

	

}
