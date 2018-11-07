package com.pgy.ups.biz.business.configuration;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataBaseConfiguration{


    @Autowired
    @Qualifier("readDataSource")
    private DataSource readDataSource;

    @Autowired
    @Qualifier("writeDataSource")
    private DataSource writeDataSource;

    @Bean(name="dynamicDataSource")
    public DynamicDataSource dynamicDataSource() {
        DataSource slave = readDataSource;//;slave();
        DataSource master = writeDataSource;
        Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
        targetDataSources.put(HandlerDataSource.DatabaseType.Slave, slave);
        targetDataSources.put(HandlerDataSource.DatabaseType.Master, master);

        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(targetDataSources);// 该方法是AbstractRoutingDataSource的方法
        dataSource.setDefaultTargetDataSource(master);
        dataSource.afterPropertiesSet();
        return dataSource;
    }

    @Bean(name="sessionFactory")
    public SqlSessionFactory sessionFactory(@Qualifier("dynamicDataSource")DynamicDataSource dataSource) throws Exception{
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
       // PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*/*.xml"));    //*Mapper.xml位置
        return sessionFactoryBean.getObject();
    }


}
