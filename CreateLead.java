package week21.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abirami");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("A");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing field...");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("sssabi15@gmail.com");
	//handle method
	WebElement State =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select drop1=new Select(State);
	//select by visible method
	drop1.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
    System.out.println(driver.getTitle());
    

}
}