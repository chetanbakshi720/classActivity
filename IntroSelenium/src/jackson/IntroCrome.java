/**
 * 
 */
package jackson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Chetan
 *
 */
public class IntroCrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" , "E:\\STS\\semister 4\\automation testing\\chromedriver.exe ");
WebDriver driver = new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();	

driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Unnati");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patel");
WebElement r1 = driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
r1.click();
driver.findElement(By.xpath("//input[@id=\"exp-2\"]")).click();
driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("1997-02-25");
driver.findElement(By.xpath("//input[@id=\"profession-0\"]")).click();
WebElement select1 = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
select1.click();
System.out.println(select1.isSelected());
driver.findElement(By.xpath("//input[@id=\"tool-2\"]")).click();
Select drop = new Select(driver.findElement(By.xpath("//select[@id=\"continents\"]")));
drop.selectByVisibleText("Antartica");
Select drop1 = new Select(driver.findElement(By.xpath("//select[@id=\"selenium_commands\"]")));
drop1.selectByVisibleText("WebElement Commands");
driver.findElement(By.xpath("//input[@class=\"input-file\"]")).sendKeys("C:\\Users\\2093906\\Desktop\\1.jpeg");
driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
try {
	Thread.sleep(20000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	driver.quit();
	}

}


driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Unnati");
driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Patel");
WebElement r1 = driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
r1.click();
driver.findElement(By.xpath("//input[@id=\"exp-2\"]")).click();
driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("1997-02-25");
driver.findElement(By.xpath("//input[@id=\"profession-0\"]")).click();
WebElement select1 = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
select1.click();
System.out.println(select1.isSelected());
driver.findElement(By.xpath("//input[@id=\"tool-2\"]")).click();
Select drop = new Select(driver.findElement(By.xpath("//select[@id=\"continents\"]")));
drop.selectByVisibleText("Antartica");
Select drop1 = new Select(driver.findElement(By.xpath("//select[@id=\"selenium_commands\"]")));
drop1.selectByVisibleText("WebElement Commands");
driver.findElement(By.xpath("//input[@class=\"input-file\"]")).sendKeys("C:\\Users\\2093906\\Desktop\\1.jpeg");
driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
try {
	Thread.sleep(20000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
