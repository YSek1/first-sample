package sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping(value = "/")
	public String hello() {
		return "hello world";
	}
}
