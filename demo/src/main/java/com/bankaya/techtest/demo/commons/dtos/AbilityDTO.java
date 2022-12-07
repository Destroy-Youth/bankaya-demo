package com.bankaya.techtest.demo.commons.dtos;

import lombok.Data;

@Data
public class AbilityDTO {
  private ReferenceDTO ability;
  private Boolean isHiden;
  private Short slot;
}
