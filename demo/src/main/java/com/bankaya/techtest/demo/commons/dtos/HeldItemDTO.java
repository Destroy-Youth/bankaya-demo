package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class HeldItemDTO {
  private ReferenceDTO item;
  @JsonProperty("version_details")
  private List<VersionDetailHeldItemDTO> versionDetails;
}
