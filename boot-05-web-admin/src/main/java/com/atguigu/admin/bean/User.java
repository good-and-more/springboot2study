package com.atguigu.admin.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("user")
public class User {
    @TableField(exist = false)//所有属性都必须在表中存在，如果不存在需要这样批注
    private String userName;
    @TableField(exist = false)
    private String password;

    //以下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
