package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
	    return "Hello, World! changed" + "こんにちは" + name + "さん！";
	}
}
