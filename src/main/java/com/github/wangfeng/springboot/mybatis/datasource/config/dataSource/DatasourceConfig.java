package com.github.wangfeng.springboot.mybatis.datasource.config.dataSource;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DatasourceConfig {

    @Bean(name = "db1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource dataSourceDB1() {
        // 创建数据源
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name = "db2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource dataSourceDB2() {
        // 创建数据源
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

}

