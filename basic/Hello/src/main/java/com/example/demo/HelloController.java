package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	@PostMapping("/hello2")
	public String sayHello(@RequestParam("name2") String name) {
	    return "Hello, World! changed" + "こんにちは" + name + "さん！";
	}
}
