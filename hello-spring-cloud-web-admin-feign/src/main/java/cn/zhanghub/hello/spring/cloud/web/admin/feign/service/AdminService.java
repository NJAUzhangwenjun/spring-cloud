package cn.zhanghub.hello.spring.cloud.web.admin.feign.service;

import cn.zhanghub.hello.spring.cloud.web.admin.feign.service.impl.AdminServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author user
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceImpl.class)
public interface AdminService {

	@RequestMapping(value = "hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam(value = "message") String message);
}
