package fr.dawan.quizapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.dawan.quizapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
