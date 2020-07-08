package GitHubRepository;

public class Main extends Challenge1 {

	public static void main(String[] args) throws InterruptedException {
		
		Challenge1 obj1 = new Challenge1();
		obj1.CreatingRepo();
		Challenge2 obj2 = new Challenge2();
		obj2.createIssue();
		Challenge3 obj3 = new Challenge3();
		obj3.CommentIssue();
		Challenge4 obj4 = new Challenge4();
		obj4.NewComment();
		Challenge5 obj5 = new Challenge5();
		obj5.DelteRepo();
		

	}

}
