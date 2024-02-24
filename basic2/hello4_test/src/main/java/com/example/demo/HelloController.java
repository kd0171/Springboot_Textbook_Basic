package com.example.demo;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@PostMapping("/register")
	public ModelAndView register
	(@RequestParam("name") String name, 
			@RequestParam("password") String password, 
			@RequestParam("gender") int gender, 
			@RequestParam("area") int area, 
			@RequestParam("interest") int[] interest, 
			@RequestParam("remarks") String remarks, 
			ModelAndView mv) {
		StringBuilder sb = new StringBuilder();
		sb.append("名前："+name);		
		sb.append("、パスワード："+password);
		sb.append("、性別："+gender);
		sb.append("、地域："+area);
		sb.append("、興味のある分野："+Arrays.toString(interest));
		sb.append("、備考："+remarks.replaceAll("/n", ""));
	    mv.setViewName("result");
	    // ()内は、templatesのフォルダ内のファイル名（＋.html）を指す。
	    mv.addObject("registData",sb.toString());
	    // ()内は、このビューが用いるデータを指す
		return mv;
		//ここではパラメータを含めたリクエストが必要、http://localhost:8080/hello?name=John
	}
}