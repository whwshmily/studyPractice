package com.whw.service;

import com.whw.bean.Guest;
import com.whw.dao.GuestDao;
import com.whw.dao.GutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
//    @Autowired
//    private GuestDao dao;
    @Autowired
    private GutDao dao;
    public List<Guest> findAll(){
        return dao.findAll();
    }
}
