package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EncounterDetailDTO {

  private Short chance;
  @JsonProperty("condition_values")
  private List<ReferenceDTO> conditionValues;
  @JsonProperty("max_level")
  private Short maxLevel;
  @JsonProperty("min_level")
  private Short minLevel;
  private ReferenceDTO method;

  public Short getChance() {
    return chance;
  }

  public void setChance(Short chance) {
    this.chance = chance;
  }

  public List<ReferenceDTO> getConditionValues() {
    return conditionValues;
  }

  public void setConditionValues(List<ReferenceDTO> conditionValues) {
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

  public ReferenceDTO getMethod() {
    return method;
  }

  public void setMethod(ReferenceDTO method) {
    this.method = method;
  }
}
