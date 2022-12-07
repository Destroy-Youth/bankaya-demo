package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VersionDetailLocationEncounterDTO extends VersionDetailDTO {
  @JsonProperty("encounter_details")
  private List<EncounterDetailDTO> encounterDetails;
  @JsonProperty("max_chance")
  private Integer maxChance;
}
