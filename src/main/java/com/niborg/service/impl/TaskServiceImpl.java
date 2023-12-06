package com.niborg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.niborg.domain.entities.TaskTask;
import com.niborg.dto.TaskDto;
import com.niborg.mapper.TaskMapper;
import com.niborg.repository.TaskRepository;
import com.niborg.service.TaskService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public TaskServiceImpl() {

    }

    @Override
    public List<TaskDto> getAll() {
        //Get all
        final List<TaskTask> taskList = taskRepository.findAll();
        //Map to Dto
        return taskList.stream().map(x ->
            TaskMapper.mapEntityToDto(x))
            .collect(Collectors.toList());
    }

    @Override
    public TaskDto getById(final Integer id) {
        final Optional<TaskTask> task = taskRepository.findById(id);
        if (task.isPresent()) {
            return TaskMapper.mapEntityToDto(task.get());
        }
        return null;
    }

    @Override
    public void save(final Integer id, final TaskDto taskDto) {
        //Create
        if (id == null) {
        final TaskTask task = new TaskTask();
        task.setPrioId(taskDto.getPriorityId());
            TaskMapper.mapDtoToEntity(taskDto, task);
            taskRepository.save(task);
        return;
        }

        //Update
        final Optional<TaskTask> task = taskRepository.findById(id);
        if (task.isPresent()) {
            final TaskTask taskEntity = task.get();
          TaskMapper.mapDtoToEntity(taskDto, taskEntity);
          taskRepository.save(taskEntity);
        }
    }
}