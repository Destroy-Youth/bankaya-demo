package com.bankaya.techtest.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bankaya.techtest.demo.commons.dtos.AbilityDTO;
import com.bankaya.techtest.demo.commons.dtos.HeldItemDTO;
import com.bankaya.techtest.demo.commons.dtos.LocationEncounterDTO;
import com.bankaya.techtest.demo.service.IPokemonService;
import com.bankaya.techtest.demo.service.IRequestRegisterService;

@RestController
public class PokemonController {

  @Autowired
  private IPokemonService pokemonService;
  @Autowired
  private IRequestRegisterService requestRegisterService;

  @GetMapping(value = "{pokemonName}/abilities")
  public ResponseEntity<List<AbilityDTO>> pokemonAbilities(@PathVariable("pokemonName") String pokemonName,
      HttpServletRequest request) {
    requestRegisterService.registerRequest("abilities", request.getRemoteAddr());
    return ResponseEntity.ok(pokemonService.getPokemonAbilities(pokemonName));
  }

  @GetMapping(value = "{pokemonName}/base-experience")
  public ResponseEntity<Integer> pokemonBAseExperience(@PathVariable("pokemonName") String pokemonName,
      HttpServletRequest request) {
    requestRegisterService.registerRequest("base-experience", request.getRemoteAddr());
    return ResponseEntity.ok(pokemonService.getPokemonBaseExperience(pokemonName));
  }

  @GetMapping(value = "{pokemonName}/held-items")
  public ResponseEntity<List<HeldItemDTO>> pokemonHeldItems(@PathVariable("pokemonName") String pokemonName,
      HttpServletRequest request) {
    requestRegisterService.registerRequest("held-items", request.getRemoteAddr());
    return ResponseEntity.ok(pokemonService.getPokemonHeldItems(pokemonName));
  }

  @GetMapping(value = "{pokemonName}/id")
  public ResponseEntity<Integer> pokemonId(@PathVariable("pokemonName") String pokemonName,
      HttpServletRequest request) {
    requestRegisterService.registerRequest("id", request.getRemoteAddr());
    return ResponseEntity.ok(pokemonService.getPokemonId(pokemonName));
  }

  @GetMapping(value = "{pokemonId}/name")
  public ResponseEntity<String> pokemonName(@PathVariable("pokemonId") Integer pokemonId,
      HttpServletRequest request) {
    requestRegisterService.registerRequest("name", request.getRemoteAddr());
    return ResponseEntity.ok(pokemonService.getPokemonName(pokemonId));
  }

  @GetMapping(value = "{pokemonName}/location-encounters")
  public ResponseEntity<List<LocationEncounterDTO>> pokemonLocationEncounters(
      @PathVariable("pokemonName") String pokemonName,
      HttpServletRequest request) {
    requestRegisterService.registerRequest("location-encounters", request.getRemoteAddr());
    return ResponseEntity.ok(pokemonService.getPokemonLocationAEncounters(pokemonName));
  }

}
