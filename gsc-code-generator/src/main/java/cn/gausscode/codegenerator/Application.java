/*
 * FileName: Application.java
 * Author: jinlong.hao jinlong.hao@gausscode.cn
 * Date: 2017-10-12
 */

package cn.gausscode.codegenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: jinlong.hao
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.gausscode.codegenerator"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
