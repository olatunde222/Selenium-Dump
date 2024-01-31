package FaceBookDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		DRIVER CONFIGURATION		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\selenium webdriver\\ChromeDriver\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(cop);
		
		
//		TESTING BEGINS
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		Targeting the FirstName, LastName, Email, PassWord Fields and Sending inputs into It 
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("New");
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("demo@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("demo@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("PassWord123");
		Thread.sleep(5000);
		
//		TARGETING THE Month, Day, Year Fields
		WebElement month_1 = driver.findElement(By.id("month"));
		Select optSelect = new Select(month_1);
		optSelect.selectByVisibleText("Sep");
		
//		Searching the webElement with id = day 
		WebElement day_1 = driver.findElement(By.id("day"));
		Select optSelect_2 = new Select(day_1);
		optSelect_2.selectByIndex(10);
		
//		Searching the webElement with id = Year 
		WebElement  Year = driver.findElement(By.id("year"));
		Select Year_1 = new Select(Year);
		Year_1.selectByValue("1980");
		Thread.sleep(5000);
		
//		TARGETING THE Gender, Pronoun, Sign-up Fields
		driver.findElement(By.xpath("//label[contains(text(), 'Custom')]")).click();
		WebElement pronoun = driver.findElement(By.name("preferred_pronoun"));
		Select pronounOpt = new Select (pronoun);
		pronounOpt.selectByIndex(1);	
		driver.findElement(By.xpath("//input[@name = 'custom_gender']")).sendKeys("They");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
				
//		QUITING the web-browser page.
		driver.quit();
		
//		Printing the Title of the URL
		String actTitle = driver.getTitle();
		String expTitle = "Sign Up for Facebook";
		
		if(actTitle.equalsIgnoreCase(expTitle)) {
			System.out.println("Test Completed Successfully");			
		}
		

	}

}
