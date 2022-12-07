package com.bankaya.techtest.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Pokemon {
  private List<Ability> abilities;
  @JsonProperty("base_experience")
  private Integer baseExperience;
  @JsonProperty("held_items")
  private List<HeldItem> heldItems;
  private Integer id;
  private String name;
  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;
}
