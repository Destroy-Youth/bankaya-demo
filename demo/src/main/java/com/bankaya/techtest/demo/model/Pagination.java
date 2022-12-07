package com.bankaya.techtest.demo.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Pagination<T extends Serializable> {
  private Integer count;
  private String next;
  private String previous;
  private List<T> results;
}
