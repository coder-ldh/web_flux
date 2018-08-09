package com.ldh.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: ldh Created on 2018/8/9
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("user")
public class User implements Serializable {
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  private String name;

  private String phone;

  private String password;
}