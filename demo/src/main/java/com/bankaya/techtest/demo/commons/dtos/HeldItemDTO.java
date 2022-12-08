package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeldItemDTO {
  private ReferenceDTO item;
  @JsonProperty("version_details")
  private List<VersionDetailHeldItemDTO> versionDetails;

  public ReferenceDTO getItem() {
    return item;
  }

  public void setItem(ReferenceDTO item) {
    this.item = item;
  }

  public List<VersionDetailHeldItemDTO> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<VersionDetailHeldItemDTO> versionDetails) {
    this.versionDetails = versionDetails;
  }
}
