package com.atguigu.study;

import com.atguigu.study.mapper.HospitalSetMapper;
import com.atguigu.study.model.HospitalSet;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.tomcat.util.security.MD5Encoder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;
import sun.security.provider.MD5;

import java.util.List;

@SpringBootTest
class Boot09HelloTestApplicationTests {

    @Autowired
    private HospitalSetMapper hospitalSetMapper;

    @Test
    void contextLoads() {
    }

//    @Test
//    public void testSelect() {
//        List<HospitalSet> list = hospitalSetMapper.selectList(null);
//        System.out.println(list);
//    }
//
//    @Test
//    public void testInsert() {
//        HospitalSet hospitalSet = new HospitalSet();
//        hospitalSet.setHoscode("2000_0");
//        hospitalSet.setSignKey(DigestUtils.md5DigestAsHex("123456".getBytes()));
//        hospitalSet.setApiUrl("http://localhost:8201");
//        int insert = hospitalSetMapper.insert(hospitalSet);
//        System.out.println(insert);
//    }
//
//    @Test
//    public void testDelete() {
//        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
//        wrapper.eq("hoscode", "2000_0");
//        int delete = hospitalSetMapper.delete(wrapper);
//        System.out.println(delete);
//    }

}
