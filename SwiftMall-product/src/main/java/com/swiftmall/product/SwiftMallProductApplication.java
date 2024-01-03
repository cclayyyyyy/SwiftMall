package com.swiftmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. Integrate Mybatis-Plus
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 * 2. Configuration
 *      (1) Configure data source
 *          1. Import database driver
 *          2. Configure data source information in 'application.yml'
 *      (2) Configure Mybatis-Plus
 *          1. Use @MapperScan
 *          2. Tell mybatis-plus, sql map file location (application.yml)
 */

@MapperScan("com.swiftmall.product.dao")
@SpringBootApplication
public class SwiftMallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwiftMallProductApplication.class, args);
    }

}
