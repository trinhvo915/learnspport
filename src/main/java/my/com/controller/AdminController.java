package my.com.controller;

import my.com.entity.User;
import my.com.service.DangNhapUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	DangNhapUserService nhapUserService;
	@GetMapping
	@Transactional
	public String Default(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/homeadmin";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/setting")
	public String Setting(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/setting";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/newpost")
	public String NewPost(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/newpost";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/listpost")
	public String ListPost(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/listPost";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/listUser")
	public String ListUser(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/listuser";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/newUser")
	public String NewUser(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/newuser";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/listDanhMuc")
	public String ListDanhMuc(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/listdanhmuc";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/newDanhMuc")
	public String NewDanhMuc(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/newdanhmuc";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/listRanh")
	public String ListRanh(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/listRanhUser";
	}
	@GetMapping
	@Transactional
	@RequestMapping("/listComment")
	public String ListComment(@SessionAttribute("user")String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username",name);
		return "admin/listComment";
	}
}
