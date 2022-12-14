package com.bankaya.techtest.demo.repository;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bankaya.techtest.demo.commons.Constants;
import com.bankaya.techtest.demo.model.Ability;
import com.bankaya.techtest.demo.model.LocationEncounter;
import com.bankaya.techtest.demo.model.Pokemon;

@FeignClient(value = Constants.POKEMON_API, url = Constants.POKEMON_API_URL)
public interface IPokemonClient {

  @GetMapping(produces = "application/json", value = "pokemon/{pokemon}", headers = { Constants.USER_AGENT_HEADER })
  public Pokemon getPokemon(@PathVariable("pokemon") String pokemon);

  @GetMapping(produces = "application/json", value = "pokemon/{pokemonId}", headers = { Constants.USER_AGENT_HEADER })
  public Pokemon getPokemon(@PathVariable("pokemonId") Integer pokemon);

  @GetMapping(produces = "application/json", value = "ability/{id}", headers = { Constants.USER_AGENT_HEADER })
  public List<Ability> getPokemonAbility(@PathVariable("id") String abilityId);

  @GetMapping(produces = "application/json", value = "item/{id}", headers = { Constants.USER_AGENT_HEADER })
  public List<Item> getHeldItem(@PathVariable("id") String itemId);

  @GetMapping(produces = "application/json", value = "pokemon/{id}/encounters", headers = {
      Constants.USER_AGENT_HEADER })
  public List<LocationEncounter> getPokemonLocationEncounters(@PathVariable("id") Integer pokemonId);

}
