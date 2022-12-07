package com.bankaya.techtest.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EncounterDetail {

  private Short chance;
  @JsonProperty("condition_values")
  private List<Reference> conditionValues;
  @JsonProperty("max_level")
  private Short maxLevel;
  @JsonProperty("min_level")
  private Short minLevel;
  private Reference method;
}
