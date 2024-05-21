package com.quizlet.quizapp.service;

import com.quizlet.quizapp.dao.QuestionDao;
import com.quizlet.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions(){
        return questionDao.findAll();
    }
    public List<Question> getQuestionsByCategory(String category){
        return questionDao.findByCategory(category);
    }
    public List<Question> getQuestionsByDifficultLevel(String DifficultLevel){
        return questionDao.findBydifficultyLevel(DifficultLevel);
    }
<<<<<<< HEAD
    public String addQuestion(Question question){
        questionDao.save(question);
        return "success";
    }
    public String updateQuestion(Question question){
        questionDao.save(question);
        return "success";
    }

=======
>>>>>>> c2cef6a6740e53fa031736bd7a8f152bfa91165c
}
