package com.example.demo;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
	@PostMapping("/register")
	public ModelAndView register
	(@ModelAttribute RegistData registData, 
			ModelAndView mv) {
		StringBuilder sb = new StringBuilder();
		sb.append("名前："+registData.getName());		
		sb.append("、パスワード："+registData.getPassword());
		sb.append("、性別："+registData.getGender());
		sb.append("、地域："+registData.getArea());
		sb.append("、興味のある分野："+Arrays.toString(registData.getInterest()));
		sb.append("、備考："+registData.getRemarks().replaceAll("/n", ""));
	    mv.setViewName("result");
	    // ()内は、templatesのフォルダ内のファイル名（＋.html）を指す。
	    mv.addObject("registData",sb.toString());
	    // ()内は、このビューが用いるデータを指す
		return mv;
		//ここではパラメータを含めたリクエストが必要、http://localhost:8080/hello?name=John
	}
}