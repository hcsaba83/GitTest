package demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeContoller {
	
	@RequestMapping("/")
	public String stories() {
		return "stories";
	}
	
	@RequestMapping("/valamik")
	public String valami() {
		return "valami";
	}

}
