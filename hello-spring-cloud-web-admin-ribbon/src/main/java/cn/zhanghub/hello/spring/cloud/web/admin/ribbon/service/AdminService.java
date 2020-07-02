package cn.zhanghub.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

	private final RestTemplate restTemplate;

	public AdminService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public String sayHi(String message) {
		return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);
	}
}
