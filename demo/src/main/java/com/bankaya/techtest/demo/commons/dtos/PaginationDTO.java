package com.bankaya.techtest.demo.commons.dtos;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PaginationDTO<T extends Serializable> {
  private Integer count;
  private String next;
  private String previous;
  private List<T> results;
}
