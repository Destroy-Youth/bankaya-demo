package com.bankaya.techtest.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.bankaya.techtest.demo.commons.dtos.VersionDetailLocationEncounterDTO;
import com.bankaya.techtest.demo.model.VersionDetailLocationEncounter;

@Mapper(componentModel = "spring", uses = { ReferenceMapper.class })
public interface VersionDetailLocationEncounterMapper {

  VersionDetailLocationEncounter mapToEntity(VersionDetailLocationEncounterDTO VersionDetailLocationEncounterDTO);

  VersionDetailLocationEncounterDTO mapToDTO(VersionDetailLocationEncounter VersionDetailLocationEncounter);

  List<VersionDetailLocationEncounter> mapToEntityList(
      List<VersionDetailLocationEncounterDTO> VersionDetailLocationEncounterDTO);

  List<VersionDetailLocationEncounterDTO> mapToDTOList(
      List<VersionDetailLocationEncounter> VersionDetailLocationEncounter);

}
