package com.devsuperrior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperrior.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
