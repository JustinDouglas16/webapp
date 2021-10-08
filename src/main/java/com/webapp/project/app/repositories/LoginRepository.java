package com.webapp.project.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.project.app.repositories.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
}
