package sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.service.ViewService;

@Controller
public class SampleController {

	private ViewService viewService;
	
	public SampleController() {
	}

	@Autowired
	public SampleController(ViewService viewService) {
		this.viewService = viewService;
	}

	@RequestMapping(value = "/hello")
	public String hello() {
		return "hello";
	}
	@RequestMapping(value = "/view")
	public String view(Model model) {
		model.addAttribute("employees", viewService.getEmployees());
		return "view";
	}
}
