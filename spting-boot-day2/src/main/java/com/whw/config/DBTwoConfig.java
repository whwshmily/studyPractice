package com.whw.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration
@MapperScan(basePackages = "com.whw.mapper",sqlSessionFactoryRef = "sqlSessionFactory2")
public class DBTwoConfig {
    @Autowired
    @Qualifier("db2")
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory2()throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }
    @Bean
    public SqlSessionTemplate sqlSessionTemplate2() throws Exception{
        return new SqlSessionTemplate(sqlSessionFactory2());
    }
}
