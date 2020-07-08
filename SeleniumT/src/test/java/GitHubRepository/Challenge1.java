package GitHubRepository;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challenge1 {
static String ReName ;
public static WebDriver driver;
String Id;
WebElement IssueLink ;

	
	public void CreatingRepo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();
		driver.findElement(By.id("login_field")).sendKeys("Sagar0912");
		driver.findElement(By.id("password")).sendKeys("Ft$b1006");
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[9]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[6]/details/summary")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[6]/details/details-menu/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"repository_name\"]")).sendKeys("CreationRepo");
		driver.findElement(By.xpath("//*[@id=\"repository_auto_init\"]")).click();
		Thread.sleep(5000);
		WebElement button =driver.findElement(By.xpath("//form[@id='new_repository']/div[3]/button[@class='btn btn-primary first-in-line']"));
		//button.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		

}
	public String FetchID(){
		Id = driver.findElement(By.xpath("//*[@id='discussion_bucket']/div/div[1]/div/div[1]/div[1]/div[2]")).getAttribute("id");
	    return Id ; 
	}

}