package com.atguigu.admin.bean;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class User {
    private String userName;
    private String password;

    //以下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
