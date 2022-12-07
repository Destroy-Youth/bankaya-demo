package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationEncounterDTO {
  @JsonProperty("location_area")
  private ReferenceDTO locationArea;
  @JsonProperty("version_details")
  private List<VersionDetailLocationEncounterDTO> versionDetails;

}
