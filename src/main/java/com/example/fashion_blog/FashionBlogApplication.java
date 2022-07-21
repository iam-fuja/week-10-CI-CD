package com.example.fashion_blog;

import com.example.fashion_blog.model.Blogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class FashionBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(FashionBlogApplication.class, args);
	}


}
