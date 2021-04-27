package com.atguigu.study.service;

import com.atguigu.study.model.HospitalSet;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface HospitalSetService extends IService<HospitalSet> {

    List<HospitalSet> selectAll();

}
