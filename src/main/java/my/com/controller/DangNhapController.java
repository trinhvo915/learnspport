package my.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dangnhap")
public class DangNhapController {
	@GetMapping
	public String Default() {
		return "dangnhap";
	}
	
	@PostMapping
	public String xuLyDangNhap(@RequestParam String username, @RequestParam String password) {
		if(username.equals("trinhvo") && password.equals("12345")) {
			return "redirect:/";
		}
		return "dangnhap";
	}
}
