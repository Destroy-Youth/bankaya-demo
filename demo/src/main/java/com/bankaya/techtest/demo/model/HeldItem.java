package com.bankaya.techtest.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class HeldItem {
  private Reference item;
  @JsonProperty("version_details")
  private List<VersionDetailHeldItem> versionDetails;
}
