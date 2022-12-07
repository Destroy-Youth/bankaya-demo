package com.bankaya.techtest.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bankaya.techtest.demo.commons.dtos.AbilityDTO;
import com.bankaya.techtest.demo.commons.dtos.HeldItemDTO;
import com.bankaya.techtest.demo.commons.dtos.LocationEncounterDTO;
import com.bankaya.techtest.demo.mappers.LocationEncountersMapper;
import com.bankaya.techtest.demo.mappers.PokemonMapper;
import com.bankaya.techtest.demo.model.LocationEncounter;
import com.bankaya.techtest.demo.model.Pokemon;
import com.bankaya.techtest.demo.repository.PokemonClient;
import com.bankaya.techtest.demo.service.IPokemonService;

public class PokemonService implements IPokemonService {

  @Autowired
  private PokemonClient pokemonClient;
  @Autowired
  private PokemonMapper pokemonMapper;
  @Autowired
  private LocationEncountersMapper locationEncountersMapper;

  @Override
  public List<AbilityDTO> getPokemonAbilities(String pokemonName) {
    Pokemon pokemon = pokemonClient.getPokemon(pokemonName);
    return pokemonMapper.mapToDTO(pokemon).getAbilities();
  }

  @Override
  public Integer getPokemonBaseExperience(String pokemonName) {
    Pokemon pokemon = pokemonClient.getPokemon(pokemonName);
    return pokemonMapper.mapToDTO(pokemon).getBaseExperience();
  }

  @Override
  public List<HeldItemDTO> getPokemonHeldItems(String pokemonName) {
    Pokemon pokemon = pokemonClient.getPokemon(pokemonName);
    return pokemonMapper.mapToDTO(pokemon).getHeldItems();
  }

  @Override
  public Integer getPokemonId(String pokemonName) {
    Pokemon pokemon = pokemonClient.getPokemon(pokemonName);
    return pokemonMapper.mapToDTO(pokemon).getId();
  }

  @Override
  public String getPokemonName(Integer pokemonId) {
    Pokemon pokemon = pokemonClient.getPokemon(pokemonId);
    return pokemonMapper.mapToDTO(pokemon).getName();
  }

  @Override
  public List<LocationEncounterDTO> getPokemonLocationAEncounters(String pokemonName) {
    Pokemon pokemon = pokemonClient.getPokemon(pokemonName);
    List<LocationEncounter> encounters = pokemonClient.getPokemonLocationEncounters(pokemon.getId());
    return locationEncountersMapper.mapToDTOList(encounters);
  }

}
