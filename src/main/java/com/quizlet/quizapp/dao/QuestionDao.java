package com.quizlet.quizapp.dao;

import com.quizlet.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);
    List<Question> findBydifficultyLevel(String difficulty_level);
//
//    @Query(value = "SELECT * FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
//    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}