package com.bankaya.techtest.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EncounterDetail {

  private Short chance;
  @JsonProperty("condition_values")
  private List<Reference> conditionValues;
  @JsonProperty("max_level")
  private Short maxLevel;
  @JsonProperty("min_level")
  private Short minLevel;
  private Reference method;

  public Short getChance() {
    return chance;
  }

  public void setChance(Short chance) {
    this.chance = chance;
  }

  public List<Reference> getConditionValues() {
    return conditionValues;
  }

  public void setConditionValues(List<Reference> conditionValues) {
    this.conditionValues = conditionValues;
  }

  public Short getMaxLevel() {
    return maxLevel;
  }

  public void setMaxLevel(Short maxLevel) {
    this.maxLevel = maxLevel;
  }

  public Short getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Short minLevel) {
    this.minLevel = minLevel;
  }

  public Reference getMethod() {
    return method;
  }

  public void setMethod(Reference method) {
    this.method = method;
  }
}
