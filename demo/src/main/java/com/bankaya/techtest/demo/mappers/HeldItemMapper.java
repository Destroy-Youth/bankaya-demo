package com.bankaya.techtest.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.bankaya.techtest.demo.commons.dtos.HeldItemDTO;
import com.bankaya.techtest.demo.model.HeldItem;

@Mapper(componentModel = "spring", uses = { ReferenceMapper.class, VersionDetailHeldItemMapper.class })
public interface HeldItemMapper {

  HeldItem mapToEntity(HeldItemDTO HeldItemDTO);

  HeldItemDTO mapToDTO(HeldItem HeldItem);

  List<HeldItem> mapToEntityList(List<HeldItemDTO> HeldItemDTO);

  List<HeldItemDTO> mapToDTOList(List<HeldItem> HeldItem);

}
