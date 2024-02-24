package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.servlet.*;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public ModelAndView sayHello(@RequestParam("name") String name, ModelAndView mv) {
	    mv.setViewName("hello4");
	    // ()内は、templatesのフォルダ内のファイル名（＋.html）を指す。
	    mv.addObject("name",name);
	    // ()内は、このビューが用いるデータを指す
		return mv;
		//ここではパラメータを含めたリクエストが必要、http://localhost:8080/hello?name=John
	}
}