package com.bankaya.techtest.demo.commons.dtos;

public class VersionDetailHeldItemDTO {
  private Short rarity;
  private ReferenceDTO version;

  public Short getRarity() {
    return rarity;
  }

  public void setRarity(Short rarity) {
    this.rarity = rarity;
  }

  public ReferenceDTO getVersion() {
    return version;
  }

  public void setVersion(ReferenceDTO version) {
    this.version = version;
  }
}
