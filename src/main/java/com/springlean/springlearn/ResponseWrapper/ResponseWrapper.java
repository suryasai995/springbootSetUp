package com.springlean.springlearn.ResponseWrapper;

public class ResponseWrapper<T> {
  private String status;
  private T data;
  
  
  public ResponseWrapper(String status, T data) {
      this.status = status;
      this.data = data;
    }
    public String getStatus() {
      return status;
  }
  public T getData() {
    return data;
  }
  


}
