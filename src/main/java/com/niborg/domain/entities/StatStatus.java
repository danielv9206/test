package com.niborg.domain.entities;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stat_status", schema = "test", catalog = "")
public class StatStatus {
  private int statId;
  private String statName;
  private String statDescription;

  @Id
  @Column(name = "STAT_ID")
  public int getStatId() {
    return statId;
  }

  public void setStatId(final int statId) {
    this.statId = statId;
  }

  @Basic
  @Column(name = "STAT_NAME")
  public String getStatName() {
    return statName;
  }

  public void setStatName(final String statName) {
    this.statName = statName;
  }

  @Basic
  @Column(name = "STAT_DESCRIPTION")
  public String getStatDescription() {
    return statDescription;
  }

  public void setStatDescription(final String statDescription) {
    this.statDescription = statDescription;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final StatStatus that = (StatStatus) o;
    return statId == that.statId && Objects.equals(statName, that.statName) && Objects
        .equals(statDescription, that.statDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statId, statName, statDescription);
  }
}
