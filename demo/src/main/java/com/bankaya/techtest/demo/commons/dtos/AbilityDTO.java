package com.bankaya.techtest.demo.commons.dtos;

public class AbilityDTO {
  private ReferenceDTO ability;
  private Boolean isHiden;
  private Short slot;

  public ReferenceDTO getAbility() {
    return ability;
  }

  public void setAbility(ReferenceDTO ability) {
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
