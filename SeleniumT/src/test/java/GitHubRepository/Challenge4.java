package GitHubRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Challenge4 extends Challenge1 {
	public void NewComment() throws InterruptedException {
		Challenge4 ob = new Challenge4();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Id =  ob.FetchID();
		String[] IssueId = Id.split("-",2);
		System.out.println(IssueId);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='new_comment_field']")).sendKeys("Issue with ID#"+" "+IssueId[1]+" "+"has been resolved");
		driver.findElement(By.xpath("//*[@id='partial-new-comment-form-actions']/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/nav/ul[@class='UnderlineNav-body list-style-none ']/li[2]/a/span")).click();
		
	}

}
