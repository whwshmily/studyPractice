package com.whw.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.whw.bean.Guest;
import com.whw.mapper.GuDao;
import org.springframework.stereotype.Service;

@Service
public class Gusss extends ServiceImpl<GuDao,Guest> implements Guservice {
}
