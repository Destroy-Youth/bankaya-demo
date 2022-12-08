package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionDetailLocationEncounterDTO {
  @JsonProperty("encounter_details")
  private List<EncounterDetailDTO> encounterDetails;
  @JsonProperty("max_chance")
  private Integer maxChance;
  private ReferenceDTO version;

  public List<EncounterDetailDTO> getEncounterDetails() {
    return encounterDetails;
  }

  public void setEncounterDetails(List<EncounterDetailDTO> encounterDetails) {
    this.encounterDetails = encounterDetails;
  }

  public Integer getMaxChance() {
    return maxChance;
  }

  public void setMaxChance(Integer maxChance) {
    this.maxChance = maxChance;
  }

  public ReferenceDTO getVersion() {
    return version;
  }

  public void setVersion(ReferenceDTO version) {
    this.version = version;
  }
}
