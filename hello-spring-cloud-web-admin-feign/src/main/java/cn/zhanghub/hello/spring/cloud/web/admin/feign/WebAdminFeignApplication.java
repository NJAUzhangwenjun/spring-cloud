package cn.zhanghub.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author user
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WebAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}
