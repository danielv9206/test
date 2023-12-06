package com.niborg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niborg.domain.entities.TaskTask;

@Repository
public interface TaskRepository extends JpaRepository<TaskTask, Integer> {
}