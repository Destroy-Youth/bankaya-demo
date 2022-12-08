package com.bankaya.techtest.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.bankaya.techtest.demo.commons.dtos.LocationEncounterDTO;
import com.bankaya.techtest.demo.model.LocationEncounter;

@Mapper(componentModel = "spring", uses = { ReferenceMapper.class, VersionDetailLocationEncounterMapper.class })
public interface LocationEncounterMapper {

  LocationEncounter mapToEntity(LocationEncounterDTO locationEncounterDTO);

  LocationEncounterDTO mapToDTO(LocationEncounter locationEncounter);

  List<LocationEncounter> mapToEntityList(List<LocationEncounterDTO> locationEncounterDTO);

  List<LocationEncounterDTO> mapToDTOList(List<LocationEncounter> locationEncounter);
}
