package com.springcloud.demo.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/config/")
public class SpringCloudConfigController {

	@Value("${abc}")
	private String abc;

	@RequestMapping(value = "abc")
	public String getHello() {

		return abc;
	}

}
