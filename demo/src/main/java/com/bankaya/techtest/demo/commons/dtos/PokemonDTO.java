package com.bankaya.techtest.demo.commons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
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
}
