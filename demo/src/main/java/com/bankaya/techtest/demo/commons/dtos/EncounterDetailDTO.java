package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class EncounterDetailDTO {

  private Short chance;
  @JsonProperty("condition_values")
  private List<ReferenceDTO> conditionValues;
  @JsonProperty("max_level")
  private Short maxLevel;
  @JsonProperty("min_level")
  private Short minLevel;
  private ReferenceDTO method;
}
