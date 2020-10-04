package me.stephenj.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class MallApplication {

//    @PostConstruct
//    void started() {
//        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8:00"));
//    }

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }

}
