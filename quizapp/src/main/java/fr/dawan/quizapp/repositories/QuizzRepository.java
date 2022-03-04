package fr.dawan.quizapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.quizapp.entities.Quizz;

public interface QuizzRepository extends JpaRepository<Quizz, Long> {

}
