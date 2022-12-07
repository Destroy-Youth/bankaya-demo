package com.bankaya.techtest.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VersionDetailLocationEncounter extends VersionDetail {
  @JsonProperty("encounter_details")
  private List<EncounterDetail> encounterDetails;
  @JsonProperty("max_chance")
  private Integer maxChance;
}
