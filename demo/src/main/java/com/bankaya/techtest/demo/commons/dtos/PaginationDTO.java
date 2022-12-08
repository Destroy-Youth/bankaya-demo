package com.bankaya.techtest.demo.commons.dtos;

import java.io.Serializable;
import java.util.List;

public class PaginationDTO<T extends Serializable> {
  private Integer count;
  private String next;
  private String previous;
  private List<T> results;

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public List<T> getResults() {
    return results;
  }

  public void setResults(List<T> results) {
    this.results = results;
  }
}
