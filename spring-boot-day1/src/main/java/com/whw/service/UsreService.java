package com.whw.service;

import com.whw.bean.Kind;
import com.whw.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsreService {
    @Autowired
    private UserDao dao;

    public List<Kind> findAll(){
        return dao.findAll();
    }
}
