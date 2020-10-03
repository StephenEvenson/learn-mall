package me.stephenj.mall.config;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2020/10/3.
 */
@Configuration
@MapperScan("me.stephenj.mall.mbg.mapper")
public class MyBatisConfig {
}
