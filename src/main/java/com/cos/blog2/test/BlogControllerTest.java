package com.cos.blog2.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 전부 스캔하는건 아니고, 특정 annotation이 붙어있는 클래스 파일들을 new해서(Ioc) spring container에 관리
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
