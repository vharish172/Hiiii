package stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class stepdefinition {
	
	WebDriver driver = hooksclass.driver;
	
	/*@Given("User is on homepage")
	
	public void user_is_on_homepage() {
		
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("webdriver is initialized");
		
		driver.get("http://retailm1.upskills.in/admin/index.php?route=common/dashboard&token=sseBVf1AOM9VzFfycLbV4o2ys4Xiti08");
	}

	@When("user enter valid Username")
	public void user_enter_valid_Username() throws InterruptedException { 
		
		driver.findElement(By.name("username")).sendKeys("admin");
        //Thread.sleep(2000);
		
	   
	}

	@And("user enter valid password")
	public void user_enter_valid_password() throws InterruptedException {
		driver.findElement(By.name("password")).sendKeys("Admin@123");     
        //Thread.sleep(2000);
	}

	@Then("login button enabled")
	public void login_button_enabled()  throws InterruptedException { 
		driver.findElement(By.tagName("button")).click();
      //  Thread.sleep(2000);
	}
	
	@Then("user will navigate to sales")
	public void user_will_navigate_to_sales() {
		//i[@class='fa fa-indent fa-lg']
		WebElement ele = driver.findElement(By.xpath("//i[@class='fa fa-indent fa-lg']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(ele).perform();
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("User navigate to GIFT VOUCHER Webpage")
	public void user_navigate_to_GIFT_VOUCHER_Webpage() {
		driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/ul/li[4]/ul/li[1]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/
	
	

		
	@Given("User in the ADD GIFT VOUCHER")
	public void user_in_the_ADD_GIFT_VOUCHER() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("webdriver is initialized"); 
		driver.get("http://retailm1.upskills.in/admin/index.php?route=sale/voucher/add&token=sseBVf1AOM9VzFfycLbV4o2ys4Xiti08");
		
		//driver.get("http://retailm1.upskills.in/admin/index.php?route=common/dashboard&token=sseBVf1AOM9VzFfycLbV4o2ys4Xiti08");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@123"); 
		driver.findElement(By.tagName("button")).click(); //*[@id="menu-sale"]/a 
		//driver.findElement(By.xpath("//*[@id=\"button-menu\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/ul/li[4]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[6]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/ul/li[4]/ul/li[1]/a")).click();
		
	}

	@When("Write a gift card code which has consist of {int} digits numeric and alphapets")
	public void write_a_gift_card_code_which_has_consist_of_digits_numeric_and_alphapets(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("code")).sendKeys("F34567895");
	}

	@When("write sender name")
	public void write_sender_name() {
		driver.findElement(By.name("from_name")).sendKeys("Harish");
	   
	}

	@When("write your email address")
	public void write_your_email_address() {
		driver.findElement(By.name("from_email")).sendKeys("harish123@gmail.com");
		
	    
	}
	
	@When("write receiptant name")
	public void write_receiptant_name() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("to_name")).sendKeys("Shelby");
	}

	@When("write receiptant email address")
	public void write_receiptant_email_address() {
		driver.findElement(By.name("to_email")).sendKeys("shelby@gmail.com");

	}

	@When("choose the theme")
	public void choose_the_theme() {
		WebElement drop=driver.findElement(By.id("input-theme"));
		Select obj = new Select(drop);
		obj.selectByVisibleText("grey");
		
	   
	}

	@When("user can also write some message")
	public void user_can_also_write_some_message() {
		driver.findElement(By.name("message")).sendKeys("Hey bro how are you. I have share you the gift card, and enjoy your day");
	}

	@When("Enter the amount")
	public void enter_the_amount() {
		driver.findElement(By.name("amount")).sendKeys("3000");
	    
	}

	@When("Choose the status")
	public void choose_the_status() {
		WebElement drop=driver.findElement(By.id("input-status"));
		Select obj = new Select(drop);
		obj.selectByVisibleText("Enabled");
	    
	}

	@Then("clicking the save the button will take to the gift vocuher window")
	public void clicking_the_save_the_button_will_take_to_the_gift_vocuher_window() throws InterruptedException {
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		driver.close();
	    
	}
	@Given("User in the EDIT GIFT VOUCHER")
	public void user_in_the_EDIT_GIFT_VOUCHER() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("webdriver is initialized");
		
		driver.get("http://retailm1.upskills.in/admin/index.php?route=sale/voucher/edit&token=sseBVf1AOM9VzFfycLbV4o2ys4Xiti08&voucher_id=90");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@123"); 
		driver.findElement(By.tagName("button")).click();
		
	}

	@When("edit the gift card code which has consist of {int}{int} digits numeric and alphapets")
	public void edit_the_gift_card_code_which_has_consist_of_digits_numeric_and_alphapets(Integer int1, Integer int2) {
		
		driver.findElement(By.name("code")).clear();
		driver.findElement(By.name("code")).sendKeys("B2567895");
	}

	@When("edit the sender name")
	public void edit_the_sender_name() {
	    
	}

	@When("edit your email address")
	public void edit_your_email_address() {
	    
	}

	@When("edit receiptant name")
	public void edit_receiptant_name() {
	    
	}

	@When("edit receiptant email address")
	public void edit_receiptant_email_address() {
	    
	}

	@When("edit the theme")
	public void edit_the_theme() {
	    
	}

	@When("edit the written message")
	public void edit_the_written_message() {
	    
	}

	@When("edit the give amount")
	public void edit_the_give_amount() {
	  
	}

	@When("edit the status")
	public void edit_the_status() {
	    
	}

	@Then("Click the save button. It should navigate to the Voucher list page")
	public void click_the_save_button_It_should_navigate_to_the_Voucher_list_page1() throws InterruptedException {
		driver.findElement(By.xpath("//button/i[@class='fa fa-save']")).click();
		Thread.sleep(3000);
		driver.close();
	   
	}
	
	@Then("on clicking the back icon, it should be the same data in the voucher page")
	public void on_clicking_the_back_icon_it_should_be_the_same_data_in_the_voucher_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@Given("User on the hompage")
	public void user_on_the_hompage() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("webdriver is initialized");
		driver.get("http://retailm1.upskills.in/admin/index.php?route=sale/voucher&token=P7PL0vUVj9pypvDVM44AkkWKjSY4WfNB");
		
	}

	@When("enter the username")
	public void enter_the_username() {
		driver.findElement(By.name("username")).sendKeys("admin");
	}

	@When("enter the password")
	public void enter_the_password() {
		driver.findElement(By.name("password")).sendKeys("Admin@123"); 
	}

	@Then("User navigate to the GIFT VOUCHER Webpage")
	public void user_navigate_to_the_GIFT_VOUCHER_Webpage() {
		driver.findElement(By.tagName("button")).click();
	}

	@When("select the any of the gift voucher")
	public void select_the_any_of_the_gift_voucher() {
		driver.findElement(By.xpath("//input[@value='83']")).click();
	}

	@When("click the delete icon")
	public void click_the_delete_icon() throws InterruptedException { 
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(3000);
	}

	@When("click ok for the confirm alert")
	public void click_ok_for_the_confirm_alert() {
	    
	}

	@Then("selected voucher will get deleted")
	public void selected_voucher_will_get_deleted() throws InterruptedException {
		Alert obj = driver.switchTo().alert();
		
		obj.accept();
		Thread.sleep(3000);
	}
	
	@When("clicking the edit icon")
	public void clicking_the_edit_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("it should take through the edit gift voucher page")
	public void it_should_take_through_the_edit_gift_voucher_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("clicking the Add icon")
	public void clicking_the_Add_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("it should take through the add gift voucher page")
	public void it_should_take_through_the_add_gift_voucher_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException(); 
	}
	
	@Given("User on the add voucher theme page using url and credentials")
	public void user_on_the_add_voucher_theme_page_using_url_and_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("enter the add voucher theme name")
	public void enter_the_add_voucher_theme_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("clicking on save icon, it should be refelected in the voucher theme list")
	public void clicking_on_save_icon_it_should_be_refelected_in_the_voucher_theme_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("User on the add voucher theme page using with the url and credentials")
	public void user_on_the_add_voucher_theme_page_using_with_the_url_and_credentials() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("webdriver is initialized");
		driver.get("http://retailm1.upskills.in/admin/index.php?route=sale/voucher_theme/add&token=ofj0KAY3R8ziaUjOtlQJIGgNceDuTFFA");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@123"); 
		driver.findElement(By.tagName("button")).click();
	    
	}

	@When("Add the voucher theme name")
	public void add_the_voucher_theme_name() {
		driver.findElement(By.xpath("//*[@id=\"form-theme-voucher\"]/div[1]/div/div/input")).sendKeys("Chunkle");
	    
	}

	@Then("clicking on back icon, it should not be add any voucher in the voucher theme list")
	public void clicking_on_back_icon_it_should_not_be_add_any_voucher_in_the_voucher_theme_list() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException(); 
	}

	
	@Given("User should be navigated to the edit vocher theme using with the url and credentials")
	public void user_should_be_navigated_to_the_edit_vocher_theme_using_with_the_url_and_credentials() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("webdriver is initialized");
		driver.get("http://retailm1.upskills.in/admin/index.php?route=sale/voucher_theme/edit&token=ofj0KAY3R8ziaUjOtlQJIGgNceDuTFFA&voucher_theme_id=88");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@123"); 
		driver.findElement(By.tagName("button")).click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("edit and enter the voucher theme name")
	public void edit_and_enter_the_voucher_theme_name() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"form-theme-voucher\"]/div[1]/div/div/input")).sendKeys("Strong");
		Thread.sleep(2000);
	}

	@Then("clicking on back icon, it should be navigate to the voucher theme list")
	public void clicking_on_back_icon_it_should_be_navigate_to_the_voucher_theme_list() {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/a/i")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	@Given("User should be navigated to the edit vocher theme using the url and credentials")
	public void user_should_be_navigated_to_the_edit_vocher_theme_using_the_url_and_credentials() {
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("webdriver is initialized");
		driver.get("http://retailm1.upskills.in/admin/index.php?route=sale/voucher_theme/edit&token=ofj0KAY3R8ziaUjOtlQJIGgNceDuTFFA&voucher_theme_id=88");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Admin@123"); 
		driver.findElement(By.tagName("button")).click();
	
	   
	}

	@When("edit the voucher theme name")
	public void edit_the_voucher_theme_name() {
		driver.findElement(By.xpath("//input[@name='voucher_theme_description[1][name]']")).clear();
		driver.findElement(By.xpath("//input[@name='voucher_theme_description[1][name]']")).sendKeys("Evergreen");
	   
	}

	@When("choose the voucher image@add_voucher")
	public void choose_the_voucher_image_add_voucher() {
	    
	}

	@Then("clicking on edit icon, it should be refelected in the voucher theme list")
	public void clicking_on_edit_icon_it_should_be_refelected_in_the_voucher_theme_list() {
		driver.findElement(By.xpath("//button[@data-toggle='tooltip']")).click();
	   
	}
	
	

}
