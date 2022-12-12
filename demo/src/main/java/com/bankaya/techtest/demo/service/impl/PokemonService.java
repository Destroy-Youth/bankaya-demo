package com.bankaya.techtest.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.bankaya.techtest.demo.commons.Constants;
import com.bankaya.techtest.demo.commons.dtos.AbilityDTO;
import com.bankaya.techtest.demo.commons.dtos.HeldItemDTO;
import com.bankaya.techtest.demo.commons.dtos.LocationEncounterDTO;
import com.bankaya.techtest.demo.mappers.LocationEncounterMapper;
import com.bankaya.techtest.demo.mappers.PokemonMapper;
import com.bankaya.techtest.demo.model.LocationEncounter;
import com.bankaya.techtest.demo.model.Pokemon;
import com.bankaya.techtest.demo.repository.PokemonClient;
import com.bankaya.techtest.demo.service.IPokemonService;

@Service
public class PokemonService implements IPokemonService {

  @Autowired
  private PokemonClient pokemonClient;
  @Autowired
  private PokemonMapper pokemonMapper;
  @Autowired
  private LocationEncounterMapper locationEncountersMapper;

  @Value("${api.baseUri}")
  private String baseUri;

  @Override
  public List<AbilityDTO> getPokemonAbilities(String pokemonName) {
    Pokemon pokemon = pokemonClient.getPokemon(pokemonName);
    pokemon.getAbilities().stream()
        .forEach(ability -> {
          ability.getAbility().setUrl(changeBaseUri(ability.getAbility().getUrl()));
        });
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
    pokemon.getHeldItems().stream()
        .forEach(heldItem -> {
          heldItem.getItem().setUrl(changeBaseUri(heldItem.getItem().getUrl()));
        });
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
    // Since there are so many nested arrays, the use of parallel stream is to try
    // to cut the time of these nested loops
    encounters.parallelStream().forEach(locationArea -> {
      locationArea.getLocationArea().setUrl(changeBaseUri(locationArea.getLocationArea().getUrl()));
      locationArea.getVersionDetails().stream().forEach(versionDetail -> {
        versionDetail.getVersion().setUrl(changeBaseUri(versionDetail.getVersion().getUrl()));
        versionDetail.getEncounterDetails().stream().forEach(encounterDetail -> {
          encounterDetail.getMethod().setUrl(changeBaseUri(encounterDetail.getMethod().getUrl()));
          encounterDetail.getConditionValues().stream().forEach(condition -> {
            condition.setUrl(changeBaseUri(condition.getUrl()));
          });
        });
      });
    });
    return locationEncountersMapper.mapToDTOList(encounters);
  }

  private String changeBaseUri(String uri) {
    return uri.replace(Constants.POKEMON_API_URL, baseUri);
  }

}
