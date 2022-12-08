package com.bankaya.techtest.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.bankaya.techtest.demo.commons.dtos.ReferenceDTO;
import com.bankaya.techtest.demo.model.Reference;

@Mapper(componentModel = "spring")
public interface ReferenceMapper {

  Reference mapToEntity(ReferenceDTO ReferenceDTO);

  ReferenceDTO mapToDTO(Reference Reference);

  List<Reference> mapToEntityList(List<ReferenceDTO> ReferenceDTO);

  List<ReferenceDTO> mapToDTOList(List<Reference> Reference);

}
