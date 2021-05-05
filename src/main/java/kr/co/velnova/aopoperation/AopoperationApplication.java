package kr.co.velnova.aopoperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* Aop를 사용하여 instance가 LangDTO이면 lang 변경
* */
@SpringBootApplication
public class AopoperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopoperationApplication.class, args);
	}

}
