package com.niborg.domain.entities;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prio_priority", schema = "test", catalog = "")
public class PrioPriority {
  private int prioId;
  private String prioName;
  private String prioDescription;

  @Id
  @Column(name = "PRIO_ID")
  public int getPrioId() {
    return prioId;
  }

  public void setPrioId(final int prioId) {
    this.prioId = prioId;
  }

  @Basic
  @Column(name = "PRIO_NAME")
  public String getPrioName() {
    return prioName;
  }

  public void setPrioName(final String prioName) {
    this.prioName = prioName;
  }

  @Basic
  @Column(name = "PRIO_DESCRIPTION")
  public String getPrioDescription() {
    return prioDescription;
  }

  public void setPrioDescription(final String prioDescription) {
    this.prioDescription = prioDescription;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final PrioPriority that = (PrioPriority) o;
    return prioId == that.prioId && Objects.equals(prioName, that.prioName) && Objects
        .equals(prioDescription, that.prioDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prioId, prioName, prioDescription);
  }
}
