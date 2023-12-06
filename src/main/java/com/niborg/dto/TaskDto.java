package com.niborg.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TaskDto {

    private String taskName;
    private String taskDescription;
    private Date taskBeginDate;
    private Date taskEndDate;
    private Integer statusId;
    private Integer priorityId;

    public TaskDto(final String taskName, final String taskDescription, final Date taskBeginDate,
        final Date taskEndDate, final Integer statusId, final Integer priorityId) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskBeginDate = taskBeginDate;
        this.taskEndDate = taskEndDate;
        this.statusId = statusId;
        this.priorityId = priorityId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(final String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(final String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getTaskBeginDate() {
        return taskBeginDate;
    }

    public void setTaskBeginDate(final Date taskBeginDate) {
        this.taskBeginDate = taskBeginDate;
    }

    public Date getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(final Date taskEndDate) {
        this.taskEndDate = taskEndDate;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(final Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(final Integer priorityId) {
        this.priorityId = priorityId;
    }
    
}
