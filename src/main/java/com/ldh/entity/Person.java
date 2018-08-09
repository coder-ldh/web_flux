package com.ldh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * @Author: ldh Created on 2018/8/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

  @Id
  private Long id;

  private String userName;
}