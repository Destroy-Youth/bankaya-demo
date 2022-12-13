package com.bankaya.techtest.demo.service.impl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import com.bankaya.techtest.demo.commons.Constants;
import com.bankaya.techtest.demo.commons.dtos.AbilityDTO;
import com.bankaya.techtest.demo.commons.dtos.HeldItemDTO;
import com.bankaya.techtest.demo.commons.dtos.LocationEncounterDTO;
import com.bankaya.techtest.demo.commons.dtos.PokemonDTO;
import com.bankaya.techtest.demo.mappers.LocationEncounterMapper;
import com.bankaya.techtest.demo.mappers.PokemonMapper;
import com.bankaya.techtest.demo.model.LocationEncounter;
import com.bankaya.techtest.demo.model.Pokemon;
import com.bankaya.techtest.demo.repository.IPokemonClient;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes = PokemonService.class)
public class PokemonServiceTest {

  @Mock
  private IPokemonClient pokemonClient;
  @Spy
  private PokemonMapper pokemonMapper;
  @Mock
  private LocationEncounterMapper locationEncountersMapper;

  @InjectMocks
  private PokemonService pokemonService;

  private Pokemon pokemock;
  private PokemonDTO pokemockDto;
  private LocationEncounter locationEncounterMock;
  private LocationEncounterDTO locationEncounterMockDto;

  @BeforeEach
  void init() {
    assertNotNull(locationEncountersMapper);
    assertNotNull(pokemonMapper);
    assertNotNull(pokemonClient);
    assertNotNull(pokemonService);

    PodamFactory factory = new PodamFactoryImpl();
    pokemock = factory.manufacturePojoWithFullData(Pokemon.class);
    pokemockDto = factory.manufacturePojoWithFullData(PokemonDTO.class);
    locationEncounterMock = factory.manufacturePojoWithFullData(LocationEncounter.class);
    locationEncounterMockDto = factory.manufacturePojoWithFullData(LocationEncounterDTO.class);

    pokemock.getAbilities().get(0).getAbility().setUrl(Constants.POKEMON_API_URL);

    pokemock.setBaseExperience(100);
    pokemock.setId(1);
    pokemock.setName("Ditto");
    pokemock.setLocationAreaEncounters("https://pokeapi.co/api/v2/pokemon/132/encounters");

  }

  @Test
  void testGetPokemonAbilities() {
    when(pokemonClient.getPokemon(anyString())).thenReturn(pokemock);
    when(pokemonMapper.mapToDTO(any(Pokemon.class))).thenReturn(pokemockDto);


    List<AbilityDTO> abilities = assertDoesNotThrow(() -> pokemonService.getPokemonAbilities("ditto"));
    assertNotNull(abilities.get(0));
    assertNotEquals(Constants.POKEMON_API_URL, abilities.get(0).getAbility().getUrl());
  }

  @Test
  void testGetPokemonBaseExperience() {
    when(pokemonClient.getPokemon(anyString())).thenReturn(pokemock);
    when(pokemonMapper.mapToDTO(any(Pokemon.class))).thenReturn(pokemockDto);


    Integer baseExperience = assertDoesNotThrow(() -> pokemonService.getPokemonBaseExperience("ditto"));
    assertNotNull(baseExperience);
  }

  @Test
  void testGetPokemonHeldItems() {
    when(pokemonClient.getPokemon(anyString())).thenReturn(pokemock);
    when(pokemonMapper.mapToDTO(any(Pokemon.class))).thenReturn(pokemockDto);


    List<HeldItemDTO> heldItems = assertDoesNotThrow(() -> pokemonService.getPokemonHeldItems("ditto"));
    assertNotNull(heldItems);
    assertNotNull(heldItems.get(0));
  }

  @Test
  void testGetPokemonId() {
    when(pokemonClient.getPokemon(anyString())).thenReturn(pokemock);
    when(pokemonMapper.mapToDTO(any(Pokemon.class))).thenReturn(pokemockDto);


    Integer id = assertDoesNotThrow(() -> pokemonService.getPokemonId("ditto"));
    assertNotNull(id);

  }

  @Test
  void testGetPokemonLocationAEncounters() {
    when(pokemonClient.getPokemon(anyString())).thenReturn(pokemock);

    List<LocationEncounter> encounters = new ArrayList<>();
    encounters.add(locationEncounterMock);
    List<LocationEncounterDTO> encountersDto = new ArrayList<>();
    encountersDto.add(locationEncounterMockDto);
    when(pokemonClient.getPokemonLocationEncounters(anyInt())).thenReturn(encounters);
    when(locationEncountersMapper.mapToDTOList(any())).thenReturn(encountersDto);


    List<LocationEncounterDTO> locationsResult = assertDoesNotThrow(
        () -> pokemonService.getPokemonLocationAEncounters("ditto"));
    assertNotNull(locationsResult);
    assertNotNull(locationsResult.get(0));

  }

  @Test
  void testGetPokemonName() {
    when(pokemonClient.getPokemon(anyInt())).thenReturn(pokemock);
    when(pokemonMapper.mapToDTO(any(Pokemon.class))).thenReturn(pokemockDto);

    String name = assertDoesNotThrow(() -> pokemonService.getPokemonName(1));
    assertNotNull(name);
  }
}
