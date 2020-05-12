package com.whw.dao;

import com.whw.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface GutDao {
    @Select("select name ,id ,sore from guest")
    List<Guest> findAll();
}
