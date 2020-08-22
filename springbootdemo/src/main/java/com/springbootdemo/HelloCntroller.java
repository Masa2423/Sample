package com.springbootdemo;

//追加
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//コントローラーとして認識させる
@RestController
public class HelloCntroller {
	//アクセス時のURL
	@RequestMapping(value = "/")
	private String hello() {
		return "Hello World!";
	}

}
