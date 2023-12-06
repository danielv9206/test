package com.niborg.domain.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "task_task", schema = "test", catalog = "")
public class TaskTask {
  private int taskId;
  private String taskName;
  private String taskDescription;
  private Date taskBeginDate;
  private Date taskEndDate;
  private Integer statId;
  private Integer prioId;
  private StatStatus statStatus;
  private PrioPriority prioPriority;



  @Id
  @Column(name = "TASK_ID")
  public int getTaskId() {
    return taskId;
  }

  public void setTaskId(final int taskId) {
    this.taskId = taskId;
  }

  @Basic
  @Column(name = "TASK_NAME")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(final String taskName) {
    this.taskName = taskName;
  }

  @Basic
  @Column(name = "TASK_DESCRIPTION")
  public String getTaskDescription() {
    return taskDescription;
  }

  public void setTaskDescription(final String taskDescription) {
    this.taskDescription = taskDescription;
  }

  @Basic
  @Column(name = "TASK_BEGIN_DATE")
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTaskBeginDate() {
    return taskBeginDate;
  }

  public void setTaskBeginDate(final Date taskBeginDate) {
    this.taskBeginDate = taskBeginDate;
  }

  @Basic
  @Column(name = "TASK_END_DATE")
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTaskEndDate() {
    return taskEndDate;
  }

  public void setTaskEndDate(final Date taskEndDate) {
    this.taskEndDate = taskEndDate;
  }

  @Column(name = "STAT_ID")
  public Integer getStatId() {
    return statId;
  }

  public void setStatId(final Integer statId) {
    this.statId = statId;
  }

  @Column(name = "PRIO_ID")
  public Integer getPrioId() {
    return prioId;
  }

  public void setPrioId(final Integer prioId) {
    this.prioId = prioId;
  }

  @ManyToOne
  @JoinColumn(name = "STAT_ID", referencedColumnName = "STAT_ID", insertable = false, updatable = false)
  public StatStatus getStatStatus() {
    return statStatus;
  }

  public void setStatStatus(final StatStatus statStatus) {
    this.statStatus = statStatus;
  }

  @ManyToOne
  @JoinColumn(name = "PRIO_ID", referencedColumnName = "PRIO_ID", insertable = false, updatable = false)
  public PrioPriority getPrioPriority() {
    return prioPriority;
  }

  public void setPrioPriority(final PrioPriority prioPriority) {
    this.prioPriority = prioPriority;
  }
}
