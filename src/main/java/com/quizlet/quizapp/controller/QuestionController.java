package com.quizlet.quizapp.controller;

import com.quizlet.quizapp.model.Question;
import com.quizlet.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> c2cef6a6740e53fa031736bd7a8f152bfa91165c

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }
    @GetMapping("difficultlevel/{difficultlevel}")
    public List<Question> getQuestionsByDifficultLevel(@PathVariable String difficultlevel){
        return questionService.getQuestionsByDifficultLevel(difficultlevel);
    }
<<<<<<< HEAD

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

    @PutMapping("update")
    public String updateQuestion(@RequestBody Question question){
        return questionService.updateQuestion(question);
    }
=======
>>>>>>> c2cef6a6740e53fa031736bd7a8f152bfa91165c
}
