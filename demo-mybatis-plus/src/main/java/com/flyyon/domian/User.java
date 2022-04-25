package com.flyyon.domian;

import lombok.Data;

/**
 * @author: Zhuyf
 * @version: 2022/4/25
 **/
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
