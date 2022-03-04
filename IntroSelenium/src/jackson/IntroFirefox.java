package jackson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IntroFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver" , "E:\\STS\\semister 4\\automation testing\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https:www.google.com");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();

	}

}
