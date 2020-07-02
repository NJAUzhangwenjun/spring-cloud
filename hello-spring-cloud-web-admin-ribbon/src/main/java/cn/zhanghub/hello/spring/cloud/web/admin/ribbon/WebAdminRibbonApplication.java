package cn.zhanghub.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: TODO
 * @author 张文军
 * @Company: njauit.cn
 * @version: 1.0
 * @date 2020/7/222:09
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebAdminRibbonApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebAdminRibbonApplication.class, args);
	}
}
