package com.web1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 *
 * @author:fsn
 * @date: 2020/1/1 18:05
 * @version
 */

@SpringBootApplication
@MapperScan({"com.web1.mapper"})
public class Web1ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Web1ServerApplication.class);
    }
}
