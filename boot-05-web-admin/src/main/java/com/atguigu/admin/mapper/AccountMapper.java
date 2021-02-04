package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    //接口中都是抽象方法
    Account getAcct(Long id);
}
