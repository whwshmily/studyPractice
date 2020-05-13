package com.whw.dao;

import com.whw.bean.GuestBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestDao {
    @Select("select id,name,sore from guest")
    List<GuestBean> findAll();
}
