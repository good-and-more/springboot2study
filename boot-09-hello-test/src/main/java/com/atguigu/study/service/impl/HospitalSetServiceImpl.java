package com.atguigu.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.study.model.HospitalSet;
import com.atguigu.study.service.HospitalSetService;
import com.atguigu.study.mapper.HospitalSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService{

    @Override
    public List<HospitalSet> selectAll() {
        List<HospitalSet> list = baseMapper.selectList(null);
        return list;
    }
}




