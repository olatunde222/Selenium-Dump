package Twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class TwitterClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		Initiating the Properties Path
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
//		Initiating the ChroMe Binary Path
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\selenium webdriver\\ChromeDriver\\chrome-win64\\chrome.exe");
		
//		ChroMe Options
		WebDriver driver = new ChromeDriver(options);
		
//		Locating the URL
		driver.get("https://twitter.com/");
		
		
//		Initiating the Driver 
		driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("newtester");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("NewTester@gmail.com");
				
//		Giving a pause of 5sec
		Thread.sleep(5000);
		
//		Selection for the Month
		WebElement month_selector = driver.findElement(By.id("SELECTOR_1"));
		Select month_1 = new Select(month_selector);
		month_1.selectByVisibleText("December");
		
//		Selection for the Day
		WebElement day_selector = driver.findElement(By.id("SELECTOR_2"));
		Select day_1 = new Select(day_selector);
		day_1.selectByIndex(21);
		
		
//		Selection for the Year 
		WebElement year_selector = driver.findElement(By.id("SELECTOR_3"));
		Select year_1 = new Select(year_selector);
		year_1.selectByValue("1960");
		
//		Giving a pause of 5sec
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),\"Next\")]")).click();
	}

}
