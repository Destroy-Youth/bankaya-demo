package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

public class LocationEncounterDTO {
  @JsonProperty("location_area")
  private ReferenceDTO locationArea;
  @JsonProperty("version_details")
  private List<VersionDetailLocationEncounterDTO> versionDetails;

  public ReferenceDTO getLocationArea() {
    return locationArea;
  }

  public void setLocationArea(ReferenceDTO locationArea) {
    this.locationArea = locationArea;
  }

  public List<VersionDetailLocationEncounterDTO> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<VersionDetailLocationEncounterDTO> versionDetails) {
    this.versionDetails = versionDetails;
  }

}
