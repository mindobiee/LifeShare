package com.springday.lifeShare.config;

import javax.sql.DataSource;

import org.apache.catalina.core.ApplicationContext;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
//@SpringBootApplication
@MapperScan(
		annotationClass = Mapper.class,
		basePackages = "com.springday.lifeShare.dao",
		sqlSessionFactoryRef = "sqlSessionFactory"
		)
public class MybatisConfig {
	
//	public static void main(String[] args) {
//        SpringApplication.run(MybatisConfig.class, args);
//    }
    
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationcontext) throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        
        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/**/*.xml");
        //sessionFactory.setConfigLocation(applicationcontext.getResource("classpath:mybatis/config.xml"));
        sessionFactory.setMapperLocations(res);
        
        return sessionFactory.getObject();
    }
 
}

