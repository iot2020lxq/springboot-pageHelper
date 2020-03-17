package cn.iot.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages={"cn.iot.pagehelper.mapper"})
@SpringBootApplication
public class SpringBoot11PageHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot11PageHelperApplication.class, args);
	}

}
