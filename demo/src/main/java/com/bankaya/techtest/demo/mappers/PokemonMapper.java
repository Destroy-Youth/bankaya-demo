package com.bankaya.techtest.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.bankaya.techtest.demo.commons.dtos.PokemonDTO;
import com.bankaya.techtest.demo.model.Pokemon;

@Mapper(componentModel = "spring")
public interface PokemonMapper {

  Pokemon mapToEntity(PokemonDTO pokemonDTO);

  PokemonDTO mapToDTO(Pokemon pokemon);

  List<Pokemon> mapToEntityList(List<PokemonDTO> pokemonDTO);

  List<PokemonDTO> mapToDTOList(List<Pokemon> pokemon);

}
