package com.correction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.correction.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {

}
