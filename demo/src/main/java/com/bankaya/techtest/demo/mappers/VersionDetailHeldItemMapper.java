package com.bankaya.techtest.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.bankaya.techtest.demo.commons.dtos.VersionDetailHeldItemDTO;
import com.bankaya.techtest.demo.model.VersionDetailHeldItem;

@Mapper(componentModel = "spring", uses = { ReferenceMapper.class })
public interface VersionDetailHeldItemMapper {

  VersionDetailHeldItem mapToEntity(VersionDetailHeldItemDTO VersionDetailHeldItemDTO);

  VersionDetailHeldItemDTO mapToDTO(VersionDetailHeldItem VersionDetailHeldItem);

  List<VersionDetailHeldItem> mapToEntityList(
      List<VersionDetailHeldItemDTO> VersionDetailHeldItemDTO);

  List<VersionDetailHeldItemDTO> mapToDTOList(
      List<VersionDetailHeldItem> VersionDetailHeldItem);

}
