package com.whw.servcie;

import com.whw.bean.Guest;
import com.whw.dao.GuestDao;
import com.whw.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestMapper dao;
    public List<Guest> findAll(){
        return dao.selectAll();

    }
}
