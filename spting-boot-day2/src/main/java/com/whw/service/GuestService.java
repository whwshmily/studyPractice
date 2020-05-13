package com.whw.service;

import com.whw.bean.GuestBean;
import com.whw.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestDao dao;

    public List<GuestBean> findAll(){
        return dao.findAll();
    }
}
