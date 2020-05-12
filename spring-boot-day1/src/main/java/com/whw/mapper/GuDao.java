package com.whw.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whw.bean.Guest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GuDao extends BaseMapper<Guest> {
}
