package com.atguigu.admin.service;

import com.atguigu.admin.bean.City;

public interface CityService {
    City getById(Long id);
    void saveCity(City city);
}
