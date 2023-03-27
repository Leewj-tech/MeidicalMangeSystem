package com.example.hospital.api.service;

import com.example.hospital.api.common.PageUtils;
import org.apache.hadoop.util.hash.Hash;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

//-*- coding: utf-8 -*-
// time: 2023/3/23 10:40
// file: DoctorService.java
// author: LeeWJ
public interface DoctorService {
    public PageUtils searchByPage(Map param);
    public HashMap searchContent(int id);
    public void updatePhoto(MultipartFile file, Integer doctorId);
    public void insert(Map param);
    public HashMap searchById(int id);
    public void update(Map param);
    public void deleteByIds(Integer[] ids);
}
