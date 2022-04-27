package edu.multi.kdigital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import other.OtherController;
import product.ProductController;
import product.ProductDAO;
import spring.mybatis.MemberDAO;
import spring.mybatis.MemberMybatisController;
import upload.UploadController;

@SpringBootApplication
@ComponentScan // 같은 패키지
@ComponentScan(basePackageClasses = OtherController.class) // 다른 패키지
@ComponentScan(basePackageClasses = UploadController.class) // 클래스가 포함된 패키지를 스캔
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@ComponentScan(basePackageClasses = ProductController.class)
// @ComponentScan(basePackages = {"upload"}) // 패키지 이름으로 스캔

@MapperScan(basePackageClasses = MemberDAO.class)
@MapperScan(basePackageClasses = ProductDAO.class)

public class MydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydemoApplication.class, args);
		System.out.println("스프링 부트 실행");
	}

}
