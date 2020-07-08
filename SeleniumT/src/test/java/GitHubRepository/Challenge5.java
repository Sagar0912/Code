package GitHubRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

public class Challenge5 extends Challenge1 {
	
	public void DelteRepo() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/div/div/h1/strong/a")).click();
		boolean staleElement = true; 

		while(staleElement){

		  try{

		     driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/nav/ul/li[9]/a/span")).click();

		     staleElement = false;


		  } catch(StaleElementReferenceException e){

		    staleElement = true;

		  }

		}

		//driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/nav/ul/li[9]/a/span")).click();
		//driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/nav/ul/li[9]/a/span")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//*[@id='options_bucket']/div[9]/ul/li[4]/details/summary")).click();
		String txt = driver.findElement(By.xpath("//strong[text()='cannot']/following-sibling::strong[text()='Sagar0912/CreationRepo']")).getText();
		System.out.println(txt);
		driver.findElement(By.xpath("//*[@id=\"options_bucket\"]/div[9]/ul/li[4]/details/details-dialog/div[3]/form/p/input")).sendKeys(txt);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='options_bucket']/div[9]/ul/li[4]/details/details-dialog/div[3]/form/button")).click();
		

	}

}
