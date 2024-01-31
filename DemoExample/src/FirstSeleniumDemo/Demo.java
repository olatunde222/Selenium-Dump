package FirstSeleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		Web-Driver path
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

//		Setting Chrome-Option
		ChromeOptions cop = new ChromeOptions();
		
//		Binary Path
		cop.setBinary("C:\\selenium webdriver\\ChromeDriver\\chrome-win64\\chrome.exe");

		
//		Setting Reference variable with the web-driver object
		WebDriver driver = new ChromeDriver(cop);
		
		
//		   						TESTING BEGINS
//		getting the URL
		driver.get("https://www.facebook.com/signup");
		
//		Maximising the Screen to Full mode
		driver.manage().window().maximize();
		
//		Targeting the FirstName, LastName, Email, PassWord Fields and Sending inputs into It 
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("New");
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("demo@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("demo@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("PassWord123");
		Thread.sleep(5000);
		
		
//		TARGETING THE Month, Day, Year Fields
		
//		Searching the webElement with id = month 
		WebElement month_1 = driver.findElement(By.id("month"));

//		Selecting the month option 
		Select optSelect = new Select(month_1);
		
//		Giving a pause time of 3ms
		Thread.sleep(5000);

//		Selecting a month from the options
		optSelect.selectByVisibleText("Jan");
		
//		Searching the webElement with id = day 
		WebElement day_1 = driver.findElement(By.id("day"));

//		Selecting the Day option 
		Select optSelect_2 = new Select(day_1);
		
//		Giving a pause time of 3ms
		Thread.sleep(5000);

//		Selecting a Day from the options
		optSelect_2.selectByIndex(21);
		
//		Searching the webElement with id = Year 
		WebElement  Year = driver.findElement(By.id("year"));

//		Selecting the Day option 
		Select Year_1 = new Select(Year);
		
//		Giving a pause time of 3ms
		Thread.sleep(5000);

//		Selecting a Day from the options
		Year_1.selectByValue("1980");
		
		
//		TARGETING THE Gender, Pronoun, Sign-up Fields
		
		driver.findElement(By.xpath("//label[contains(text(), 'Custom')]")).click();
		WebElement pronoun = driver.findElement(By.name("preferred_pronoun"));
		Select pronounOpt = new Select (pronoun);
		pronounOpt.selectByIndex(1);	
		driver.findElement(By.xpath("//input[@name = 'custom_gender']")).sendKeys("They");
		Thread.sleep(5000);
		
		

		
		
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
		
//		Printing the Title of the URL
		System.out.println(driver.getTitle());		
		
		
//		QUITING the web-browser page.
//		driver.quit();
		
	}

}
	