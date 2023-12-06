package com.niborg.mapper;

import com.niborg.domain.entities.TaskTask;
import com.niborg.dto.TaskDto;

public class TaskMapper {

  public static void mapDtoToEntity(final TaskDto taskDto, final TaskTask taskEntity) {
    taskEntity.setStatId(taskDto.getStatusId());
    taskEntity.setPrioId(taskDto.getPriorityId());
    taskEntity.setTaskBeginDate(taskDto.getTaskBeginDate());
    taskEntity.setTaskEndDate(taskDto.getTaskEndDate());
    taskEntity.setTaskName(taskDto.getTaskName());
    taskEntity.setTaskDescription(taskDto.getTaskDescription());
  }


  public static TaskDto mapEntityToDto(final TaskTask taskEntity) {
   return
       new TaskDto(taskEntity.getTaskName(), taskEntity.getTaskDescription(),
           taskEntity.getTaskBeginDate(), taskEntity.getTaskEndDate(), taskEntity.getStatId(), taskEntity.getPrioId());
  }

}
