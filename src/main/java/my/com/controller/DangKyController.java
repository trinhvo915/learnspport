package my.com.controller;

import my.com.service.DangKyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dangky")
public class DangKyController {

	@Autowired
	DangKyUserService dangKyUserService;

	@GetMapping
	public String Default() {

		return "dangki";
	}
}
