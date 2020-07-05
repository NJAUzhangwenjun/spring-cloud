package cn.zhanghub.hello.spring.cloud.web.admin.feign.service.impl;

import cn.zhanghub.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Description: 服务器出现请求后序服务是出现连接失败时候就会调用这个实现方法
 * @author 张文军
 * @Company: njauit.cn
 * @version: 1.0
 * @date 2020/7/317:38
 */
@Component
public class AdminServiceImpl implements AdminService {
	@Override
	public String sayHi(String message) {
		return String.format("Hi, your message is %s,but time is out ! please try again latter", message);
	}
}
