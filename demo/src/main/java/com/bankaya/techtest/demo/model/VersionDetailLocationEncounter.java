package com.bankaya.techtest.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionDetailLocationEncounter {
  @JsonProperty("encounter_details")
  private List<EncounterDetail> encounterDetails;
  @JsonProperty("max_chance")
  private Integer maxChance;
  private Reference version;

  public List<EncounterDetail> getEncounterDetails() {
    return encounterDetails;
  }

  public void setEncounterDetails(List<EncounterDetail> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  public Integer getMaxChance() {
    return maxChance;
  }

  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  public Reference getVersion() {
    return version;
  }

  public void setVersion(Reference version) {
    this.version = version;
  }
}
