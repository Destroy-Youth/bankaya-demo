package com.bankaya.techtest.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ability {
  private Reference ability;
  @JsonProperty("is_hiden")
  private Boolean isHiden;
  private Short slot;

  public Reference getAbility() {
    return ability;
  }

  public void setAbility(Reference ability) {
    this.ability = ability;
  }

  public Boolean getIsHiden() {
    return isHiden;
  }

  public void setIsHiden(Boolean isHiden) {
    this.isHiden = isHiden;
  }

  public Short getSlot() {
    return slot;
  }

  public void setSlot(Short slot) {
    this.slot = slot;
  }
}
