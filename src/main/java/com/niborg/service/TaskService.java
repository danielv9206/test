package com.niborg.service;

import com.niborg.domain.entities.TaskTask;
import com.niborg.dto.TaskDto;

import java.util.List;
import java.util.Optional;

/**
 * Task service.
 */
public interface TaskService {

  List<TaskDto> getAll();

  TaskDto getById(Integer id);

  void save(Integer id, TaskDto dto);

}
