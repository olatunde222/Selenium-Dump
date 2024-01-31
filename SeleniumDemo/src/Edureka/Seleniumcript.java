package Edureka;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;


public class Seleniumcript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Adding the Driver		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
//		Creating CHROME Options
		ChromeOptions cop = new ChromeOptions();
		
//		Setting the Binary Path
		cop.setBinary("C:\\selenium webdriver\\ChromeDriver\\chrome-win64\\chrome.exe");
		
//		Passing the Binary as a Prop into the web-driver object
		WebDriver driver = new ChromeDriver(cop);
		
		
//		Opening the URL
		driver.get("https://www.edureka.co");

		
//		Printing the Title of the URL
		System.out.println(driver.getTitle());
		
//		QUITING the web-browser page.
		driver.quit();
	}

}
