package com.bankaya.techtest.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Ability {
  private Reference ability;
  @JsonProperty("is_hiden")
  private Boolean isHiden;
  private Short slot;
}
