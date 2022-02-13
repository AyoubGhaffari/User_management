package com.ayoub.gestionutilisateurs.data.repository;

import com.ayoub.gestionutilisateurs.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
