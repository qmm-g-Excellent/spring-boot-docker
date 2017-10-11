package com.didisapce.dto;

import lombok.Data;

import javax.persistence.Id;

@Data
public class userDTO {
    //@Id设置主键
    @Id
    private Long id;

    private String name;

    private Integer age;
}
