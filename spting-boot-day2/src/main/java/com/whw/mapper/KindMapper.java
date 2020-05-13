package com.whw.mapper;

import com.whw.bean.Kind;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface KindMapper {
    @Select("select kid , kname from kind")
    List<Kind> findAll();
}
