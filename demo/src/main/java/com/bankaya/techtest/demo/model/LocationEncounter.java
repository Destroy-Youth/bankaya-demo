package com.bankaya.techtest.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationEncounter {
  @JsonProperty("location_area")
  private Reference locationArea;
  @JsonProperty("version_details")
  private List<VersionDetailLocationEncounter> versionDetails;

}
