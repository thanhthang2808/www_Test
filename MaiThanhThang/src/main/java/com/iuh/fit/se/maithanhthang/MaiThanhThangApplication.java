package com.iuh.fit.se.maithanhthang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.iuh.fit.se.maithanhthang.models")
public class MaiThanhThangApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaiThanhThangApplication.class, args);
    }

}
