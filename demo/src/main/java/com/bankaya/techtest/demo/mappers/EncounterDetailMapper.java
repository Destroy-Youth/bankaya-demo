package com.bankaya.techtest.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.bankaya.techtest.demo.commons.dtos.EncounterDetailDTO;
import com.bankaya.techtest.demo.model.EncounterDetail;

@Mapper(componentModel = "spring", uses = { ReferenceMapper.class })
public interface EncounterDetailMapper {

  EncounterDetail mapToEntity(EncounterDetailDTO EncounterDetailDTO);

  EncounterDetailDTO mapToDTO(EncounterDetail EncounterDetail);

  List<EncounterDetail> mapToEntityList(List<EncounterDetailDTO> EncounterDetailDTO);

  List<EncounterDetailDTO> mapToDTOList(List<EncounterDetail> EncounterDetail);

}
