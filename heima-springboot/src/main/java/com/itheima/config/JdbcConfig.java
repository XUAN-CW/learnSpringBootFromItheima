package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author XUAN
 * @date 2020/10/26 - 17:45
 * @references
 * [springboot(四)——@EnableConfigurationProperties是如何起作用的你知道吗](https://segmentfault.com/a/1190000018987185)
 * @purpose
 * @errors
 * @instruction
 *   用springboot开发的过程中，我们会用到@ConfigurationProperties注解，
 *   主要是用来把properties或者yml配置文件转化为bean来使用的，
 *   而@EnableConfigurationProperties注解的作用是@ConfigurationProperties注解生效。
 *   如果只配置@ConfigurationProperties注解，在IOC容器中是获取不到properties配置文件转化的bean的，
 *   当然在@ConfigurationProperties加入注解的类上加@Component也可以使交于springboot管理。
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
    @Bean
    public DataSource dataSource() {
        // 数据已自动注入，参考下方有 @Bean 的方法参数注入
        return new DruidDataSource();
    }

//    @Bean
//    public DataSource dataSource(JdbcProperties jdbcProperties) {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        dataSource.setUrl(jdbcProperties.getUrl());
//        dataSource.setUsername(jdbcProperties.getUsername());
//        dataSource.setPassword(jdbcProperties.getPassword());
//        return dataSource;
//    }

}
