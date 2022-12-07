package com.bankaya.techtest.demo.service;

import java.util.List;

import com.bankaya.techtest.demo.commons.dtos.AbilityDTO;
import com.bankaya.techtest.demo.commons.dtos.HeldItemDTO;
import com.bankaya.techtest.demo.commons.dtos.LocationEncounterDTO;

public interface IPokemonService {

  List<AbilityDTO> getPokemonAbilities(String pokemonName);

  Integer getPokemonBaseExperience(String pokemonName);

  List<HeldItemDTO> getPokemonHeldItems(String pokemonName);

  Integer getPokemonId(String pokemonName);

  String getPokemonName(Integer pokemonId);

  List<LocationEncounterDTO> getPokemonLocationAEncounters(String pokemonName);
}
