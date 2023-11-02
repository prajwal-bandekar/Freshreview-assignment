package org.freshreview.entity;

import lombok.Data;

@Data
public class ResponseStructure<T> {
private T data;
private String message;
private int statusCode;
}
