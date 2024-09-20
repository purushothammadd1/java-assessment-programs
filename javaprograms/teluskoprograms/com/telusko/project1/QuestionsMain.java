package com.telusko.project1;

public class QuestionsMain {
	public static void main(String[] args) {
		QuestionService question=new QuestionService();
		question.displayQuestions();
		question.printScore();
	}

}
