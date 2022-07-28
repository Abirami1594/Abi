
package week21.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnTheBrowser {
	
	

    public static void main(String[] args) {
	//setup the path
	WebDriverManager.chromedriver().setup();
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//Load the url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser or window
	driver.manage().window().maximize();
	//Add the wait
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   //enter the username 
   driver.findElement(By.id("username")).sendKeys("demosalesmanager");
   //enter the password
   driver.findElement(By.id("password")).sendKeys("crmsfa");
   //click the login button
   driver.findElement(By.className("decorativeSubmit")).click();
   //short cut for string-ctrl+2 or ctrl+2 popup use downarrow choose second optionpress enter
   String title=driver.getTitle();
   //print the statement
   System.out.println(title);
   //click CRM/SFA
   driver.findElement (By.linkText("CRM/SFA")).click();
   //click the lead
   driver.findElement (By.linkText("Leads")).click();
   //click the create lead
   driver.findElement (By.linkText("Create Lead")).click();
   //enter the company name
   driver.findElement(By.id("createLeadForm_companyname")).sendKeys("Testleaf");
   //enter the first name
   driver.findElement(By.id("createLeadForm_firstname")).sendKeys("Abirami");
   //enter the last name
   driver.findElement(By.id("createLeadForm_lastname")).sendKeys("s");
   //handle the drop and ctrl+2 popup use down arrow choose second option press enter
   WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
   //ctrl+2+l findElement Return WebElement(source(i.e0given element))
   Select drop1=new Select(source);
   //select by visible method
   drop1.selectByVisibleText("Conference");
   //select by vaule
   drop1.selectByValue("LEAD_DIRECTMAIL");
   //select by index
   drop1.selectByIndex(8);
   
		   
   
	
}
}

