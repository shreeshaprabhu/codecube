package in.ac.manit.matrix.codecube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	@ResponseBody
	public String showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			@RequestParam(value = "schno", required = false, defaultValue = "") String schno) {
		System.out.println("in controller");

		return "{ \"message\" : \"Hello " + name + " " + schno + "\" }";
	}
}
