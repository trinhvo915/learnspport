package my.com.controller;

import my.com.entity.User;
import my.com.service.DangNhapUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dangnhap")
@SessionAttributes(names = "user")
public class DangNhapController {

    @Autowired
    DangNhapUserService dangNhapUserService;

	@GetMapping
	public String Default() {
		return "dangnhap";
	}

	@PostMapping
	@Transactional
	public String xuLyDangNhap(@RequestParam String username, @RequestParam String password, ModelMap modelMap) {
        boolean check = dangNhapUserService.checkLogin(username,password);

        if (check) {
            modelMap.addAttribute("user",username);
            return "redirect:/";
        }
	    return "dangnhap";
	}
}
