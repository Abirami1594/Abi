package week21.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	public static void main(String[] args) {
		//setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/contol/login");
		//max mywindow
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//click CRM/SFA
//		driver.findElement(By.xpath("//a[contains(text(),CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='CRM/SFA']")).click();
		//click the lead button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//click create lead
		driver.findElement(By.xpath("//a[text()='create Lead']")).click();
		//Enter companyname
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		//Enter first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstname']")).sendKeys("Abirami");
		//Enter the lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_Latname']")).sendKeys("S");
		//dropdown
		//Find the Element
		WebElement market = driver.findElement(By.xpath("//select[contain(@id,'createLead')])[2]"));
		//inculde the Select class with webelement
		Select drop2=new Select(market);
		drop2.selectByIndex(4);
		//click button
		driver.findElement(By.xpath("//input[@name'submitButton']")).click();
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		//verify both title are same
		if(title2.contains("view lead")) {
			System.out.println("Title is same");
		}
		else {
			System.out.println("Not equal");
		}
		
		
		}

}
