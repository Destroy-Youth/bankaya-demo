package com.bankaya.techtest.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeldItem {
  private Reference item;
  @JsonProperty("version_details")
  private List<VersionDetailHeldItem> versionDetails;

  public Reference getItem() {
    return item;
  }

  public void setItem(Reference item) {
    this.item = item;
  }

  public List<VersionDetailHeldItem> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<VersionDetailHeldItem> versionDetails) {
    this.versionDetails = versionDetails;
  }
}
