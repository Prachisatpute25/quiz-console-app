package com.dora.quiz.client;

import com.dora.quiz.models.QuizResult;
import com.dora.quiz.service.QuestionService;
import com.dora.quiz.service.QuizService;

public class QuizAppClient {
    
    public static void main(String[] args) {
        
    	QuestionService questionService = new QuestionService(5);
    	QuizService quizService = new QuizService(questionService);
    	
    	quizService.playQuiz();
    	
    	QuizResult result = quizService.getResult();
    	
    	System.out.println("Total correct answers:"+result.getCorrectAnswers());
    	System.out.println("Total incorrect answers:"+result.getIncorrectAnswers());
    	System.out.println("Percentage:"+result.getPercentage());
    	System.out.println("Suggestion:"+result.getSuggestion());
    
    }
}