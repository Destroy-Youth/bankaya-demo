package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonDTO {
  private List<AbilityDTO> abilities;
  @JsonProperty("base_experience")
  private Integer baseExperience;
  @JsonProperty("held_items")
  private List<HeldItemDTO> heldItems;
  private Integer id;
  private String name;
  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters;

  public List<AbilityDTO> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<AbilityDTO> abilities) {
    this.abilities = abilities;
  }

  public Integer getBaseExperience() {
    return baseExperience;
  }

  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  public List<HeldItemDTO> getHeldItems() {
    return heldItems;
  }

  public void setHeldItems(List<HeldItemDTO> heldItems) {
    this.heldItems = heldItems;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }
}
