package OlaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Seleniumscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chrome-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.edureka.com");
	System.out.println(driver.getTitle());
	driver.quit();
	}

}
