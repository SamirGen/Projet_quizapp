package fr.dawan.quizapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.dawan.quizapp.entities.Question;

@Repository("questionRepository")
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}

