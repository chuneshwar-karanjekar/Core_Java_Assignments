package assignment_7;

public class QuestionAssign06 {
	int queNo;
	String ques;
	String optionA;
	String optionB;
	String optionC;
	String optionD;
	String answer;
	
	public void setQuestion(int qn,String que, String optA, String optB, String optC, String optD, String ans) {
	queNo =qn;
	ques = que;
	optionA = optA;
	optionB = optB;
	optionC = optC;
	optionD = optD;
	answer =  ans;
	}
	
	public void display() {
		System.out.println(queNo+" "+ques+"\n"+"option A :"+optionA+"\n"+"option B :"+optionB+"\n"+"option C :"+optionC+"\n"+"option D :"+optionD+"\n"+answer);
	}
	public static void main(String[] args) {
		QuestionAssign06  obj = new QuestionAssign06();
		obj.setQuestion(01, "What is your name ?", "chuneshwar", "prakash", "ram", "rahul", "Option A is Correct.");
		
		obj.display();
	}

}
