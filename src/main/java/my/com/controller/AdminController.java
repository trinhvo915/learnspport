package my.com.controller;

import my.com.entity.MonHoc;
import my.com.entity.User;
import my.com.service.DangNhapUserService;
import my.com.service.DanhMucService;
import my.com.utils.ConvertTimesamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	DangNhapUserService nhapUserService;

	@Autowired
    DanhMucService danhMucService;

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
        ArrayList<MonHoc> listMocHoc = danhMucService.listDanhMuc();
        modelMap.addAttribute("listdm",listMocHoc);
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
	@RequestMapping("/add")
	public String AddDanhMuc(@SessionAttribute("user")String username, ModelMap modelMap,
                             @RequestParam String nameMonHoc)  {
		try{
			User user = nhapUserService.checkLogin(username);
			String name = user.getProfile().getName();
			modelMap.addAttribute("username",name);
            //Timestamp date = ConvertTimesamp.converStringtoTimestamp(createday);
			MonHoc monHoc = new MonHoc(nameMonHoc);
			String result = danhMucService.SaveorUpdate(monHoc);
			modelMap.addAttribute("result",result);
			return "admin/newdanhmuc";
		}catch (Exception e){

		}
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
