package week21.day2;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
	public static void main(String[]  args)  throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.findElement(By.xpath("//input[id='username']")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//span[text()='phone']")).click();
	
	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("9");
	driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("1");
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9435674319");
	//get title
	String title = driver.getTitle();
	//syso
	System.out.println(title);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//*[@id=\"ext-gen478\"]/div/table/thead/tr/td[1]/di")).getText();
	System.out.println(text);
	
	driver.findElement(By.xpath("//div[contains(@class,  'x-grid3-col-partyId')]//a[1]")).click();
	driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10383");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	String text2 = driver.findElement(By.xpath("div[text()= 'No records to display']")).getText();
	System.out.println(text2);
	if (text.contains("No records to display")) {
		System.out.println("Lead Sucessfuly deleted");
		
	}else {
		
		System.out.println("Lead is Not Deleted");
		driver.quit();
	}
	
	
	
	

}
}