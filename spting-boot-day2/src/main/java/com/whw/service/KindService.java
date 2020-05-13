package com.whw.service;

import com.whw.bean.Kind;
import com.whw.mapper.KindMapper;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KindService {
    @Autowired
    private KindMapper mapper;

    public List<Kind> findAll(){
        return mapper.findAll();
    }
}
