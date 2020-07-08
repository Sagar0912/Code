package GitHubRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Challenge3 extends Challenge1 {
	
	
	public void CommentIssue() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='partial-new-comment-form-actions']/div/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='discussion_bucket']/div/div[1]/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/details/summary[@aria-label='Add your reaction']")).click();
	    driver.findElement(By.xpath("//*[@id='discussion_bucket']/div/div[1]/div/div[1]/div[1]/div[2]/div/div[1]/div[1]/details/details-menu[@aria-label='Pick your reaction']/form/div[2]/button[@data-reaction-label='Laugh']")).click();
	
	}
	
	
	

}
