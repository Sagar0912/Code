package GitHubRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Challenge2 extends Challenge1 {
	static String Repo ;

	public void createIssue () throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		IssueLink = driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/nav/ul[@class='UnderlineNav-body list-style-none ']/li[2]/a/span"));
		IssueLink.click();
		driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[2]/div/div/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='issue_title']")).sendKeys("Challenge1");
		driver.findElement(By.xpath("//*[@id='new_issue']/div/div/div[1]/div/div[1]/div[2]/button")).click();
		Thread.sleep(5000);
		Repo = driver.findElement(By.xpath("//*[@id='partial-discussion-header']/div[1]/div/h1/span[1]")).getText();
		driver.findElement(By.xpath("//*[@id='partial-discussion-header']/div[1]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id='issue_title']")).sendKeys("ExtensionIssue"+":"+Repo);
		driver.findElement(By.xpath("//*[@id='issue_body']")).sendKeys("Issue already has bee raised as part of Issue"+":"+Repo);
		driver.findElement(By.xpath("//*[@id='new_issue']/div/div/div[1]/div/div[1]/div[2]/button")).click();
		
		
		

	}
	
}
