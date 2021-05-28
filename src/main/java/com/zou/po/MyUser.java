package com.zou.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MyUser {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}
