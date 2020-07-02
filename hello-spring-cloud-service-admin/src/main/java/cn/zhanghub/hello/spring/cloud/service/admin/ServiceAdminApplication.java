package cn.zhanghub.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author user
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceAdminApplication.class, args);
	}
}
