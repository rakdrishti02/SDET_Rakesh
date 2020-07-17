package Elearn_stepdefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import common.wrapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Elearning_StepDefinition {
	static WebDriver driver;
	String url = "http://elearningm1.upskills.in/";
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Then("^I enter the username as \"([^\"]*)\"$")
	public void i_enter_the_username_as(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(username); 
	}

	@Then("^Enter the password as \"([^\"]*)\"$")
	public void enter_the_password_as(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.cssSelector("input[placeholder='Pass']")).sendKeys(password); 
	}

	@Then("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("submitAuth")).click();
	}
	@When("^I click on link classes$")
	public void I_click_on_link_classes(){
		driver.findElement(By.xpath("//a[contains(text(),' Classes')]")).click();
	}
	@Given("^I click on Add classes icon$")
	public void clickonAddClasses(){
		driver.findElement(By.xpath("//img[@alt='Add classes']")).click();
	}
	@When("^Enter valid credential in name textbox as \"([^\"]*)\"$")
	public void enter_valid_credential_in_name_textbox_as(String name) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@id='usergroup_name']")).sendKeys(wrapper.getDataFromExcel(1, 0)); 
	}

	@When("^Enter valid credentail in the description as \"([^\"]*)\"$")
	public void enter_valid_credentail_in_the_description_as(String description) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//textarea[@id='usergroup_description']")).sendKeys(wrapper.getDataFromExcel(1, 1));
	}

	@When("^select \"([^\"]*)\" from the group permission list$")
	public void select_from_the_group_permission_list(String text) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement val = driver.findElement(By.xpath("//div[@class='filter-option-inner-inner']"));
		val.click();
		/*Select sel = new Select(val);
	    sel.selectByVisibleText(text);    */
		driver.findElement(By.xpath("//span[contains(text(),'Open')]")).click();
	}

	@Then("^click on Add button$")
	public void click_on_Add_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[@id='usergroup_submit']")).click();
	    
	}
	@Given("^I select the class \"([^\"]*)\"$")
	public void clickOnSubscriberUsersToClass(String actVal) throws InterruptedException{
		Thread.sleep(5000);
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='usergroups']/tbody/tr"));
		int cnt = rows.size();
		System.out.println("The no of rows:" + cnt);
		for(int i=2;i<=cnt;i++){
			String expVal = driver.findElement(By.xpath("//table[@id='usergroups']/tbody/tr["+i+"]/td[1]")).getText();
			if(expVal.equalsIgnoreCase(actVal)){
				System.out.println("The rows number:"+i);
				driver.findElement(By.xpath("//table[@id='usergroups']/tbody/tr["+i+"]/td[6]/a/img[@alt='Subscribe users to class']")).click();
				break;
			}
				
	}
	

	}
	@Then("^I select user by starting letter \"([^\"]*)\"$")
	public void selectUser(String user) throws IOException{
		WebElement firstlet = driver.findElement(By.xpath("//select[@name='firstLetterUser']"));
		Select sel = new Select(firstlet);
//		sel.selectByVisibleText(user);
		sel.selectByVisibleText(wrapper.getDataFromExcel(1, 3));
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='elements_not_in_name']")));
		sel1.selectByVisibleText("Teacher RT (koolguru)  - KOOLGURU");
//		sel1.selectByVisibleText(wrapper.getDataFromExcel(1, 4));
		driver.findElement(By.xpath("//*[@id='cm-content']/div/form/div/div[2]/div/button[1]")).click();
//		driver.findElement(By.cssSelector("fa fa-arrow-right")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
	@Then("^validate the successful message$")
	public void validateUpdate(){
		String message=driver.findElement(By.xpath("//div[@class='alert alert-info']")).getText();
		System.out.println("The message is:"+message);
	}
	
	@Given("^I select the new class \"([^\"]*)\"$")
	public void clickOnSubscribeClasses(String actVal) throws InterruptedException{
		Thread.sleep(5000);
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='usergroups']/tbody/tr"));
		int cnt = rows.size();
		System.out.println("The no of rows:" + cnt);
		for(int i=2;i<=cnt;i++){
			String expVal = driver.findElement(By.xpath("//table[@id='usergroups']/tbody/tr["+i+"]/td[1]")).getText();
			if(expVal.equalsIgnoreCase(actVal)){
				System.out.println("The rows number:"+i);
				driver.findElement(By.xpath("//table[@id='usergroups']/tbody/tr["+i+"]/td[6]/a/img[@alt='Subscribe class to courses']")).click();
				break;
			}
				
	}
	}
	
	@Then("^I select the first letter as \"([^\"]*)\"$")
	public void selectCourseTitle(String ltr) throws IOException{
		Select newSel = new Select(driver.findElement(By.xpath("//select[@name='firstLetterUser']")));
//		newSel.selectByVisibleText(ltr);
		newSel.selectByVisibleText(wrapper.getDataFromExcel(1, 6));
		Select newSel1 = new Select(driver.findElement(By.xpath("//select[@id='elements_not_in']")));
//		newSel1.selectByVisibleText("BOTKABY (PDG)");
		newSel1.selectByVisibleText(wrapper.getDataFromExcel(1, 7));
		driver.findElement(By.xpath("//*[@id='cm-content']/div/form/table/tbody/tr[3]/td[2]/button[1]/em")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}
	
	//div[@class='alert alert-info']
	@Then("^Validate class is subscribed$")
	public void validateClass() throws InterruptedException{
		Thread.sleep(3000);
		List<WebElement> lst= driver.findElements(By.xpath("//div[@class='alert alert-info']"));
		System.out.println("No of elements: " + lst.size());
		for(int i=0; i<lst.size();i++){
			System.out.println(lst.get(i).getText());
		}
		System.out.println("Checking git..");
		
		
		/*for (WebElement webElement : lst) {

			System.out.println(webElement.getText());

			}*/
		
	}

}
