package com.guiyideguang.panta.zhen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.guiyideguang.panta.zhen.dao")
public class ZhenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhenApplication.class, args);
	}

}
