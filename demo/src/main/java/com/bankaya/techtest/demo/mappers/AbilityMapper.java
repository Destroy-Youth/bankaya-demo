package com.bankaya.techtest.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.bankaya.techtest.demo.commons.dtos.AbilityDTO;
import com.bankaya.techtest.demo.model.Ability;

@Mapper(componentModel = "spring", uses = { ReferenceMapper.class })
public interface AbilityMapper {

  Ability mapToEntity(AbilityDTO AbilityDTO);

  AbilityDTO mapToDTO(Ability Ability);

  List<Ability> mapToEntityList(List<AbilityDTO> AbilityDTO);

  List<AbilityDTO> mapToDTOList(List<Ability> Ability);

}
