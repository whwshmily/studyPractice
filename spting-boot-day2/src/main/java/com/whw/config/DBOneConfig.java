package com.whw.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.whw.dao",sqlSessionFactoryRef = "sqlSessionFactory1")
public class DBOneConfig {
    @Autowired
    @Qualifier("db1")
    private DataSource config;
    @Bean
    public SqlSessionFactory sqlSessionFactory1() throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(config);
        return bean.getObject();
    }
    @Bean
    public SqlSessionTemplate sqlSessionTemplate1()throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory1());
    }
}
