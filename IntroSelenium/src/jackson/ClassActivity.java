package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivity {public static void main(String[] args) {
	// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" , "E:\\STS\\semister 4\\automation testing\\chromedriver.exe ");
WebDriver driver = new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();	


//by id
driver.findElement(By.xpath("//select[@id=\"multiselect1\"]//option[@value=\"swiftx\"]")).click();
driver.findElement(By.xpath("//select[@id=\"multiselect1\"]//option[@value=\"Hyundaix\"]")).click();

//by class
driver.findElement(By.xpath("//select[@class=\"combobox\"]//option[@id=\"ironman4\"]")).click();


// Text Box
driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("chetan bakshi");


// Radio Buttons
WebElement r1 = driver.findElement(By.xpath("//input[@id=\"radio1\"]"));
r1.click();

WebElement r2 = driver.findElement(By.xpath("//input[@id=\"radio2\"]"));
r2.click();

// text area 
driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));

// side buttons orange blue
WebElement select1 = driver.findElement(By.xpath("//input[@id=\"checkbox1\"]"));
select1.click();
System.out.println(select1.isSelected());

WebElement select2 = driver.findElement(By.xpath("//input[@id=\"checkbox2\"]"));
select2.click();
System.out.println(select2.isSelected());

//text box with text
driver.findElement(By.xpath("//textarea[contains(text(),'ReadThisText')]"));

//side buttons
driver.findElement(By.xpath("button[contains(text(),'Submit')")).click();
driver.findElement(By.xpath("button[contains(text(),'Login')")).click();
driver.findElement(By.xpath("button[contains(text(),'Register')")).click();



}
}