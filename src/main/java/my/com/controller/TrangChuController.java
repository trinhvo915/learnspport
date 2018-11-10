package my.com.controller;

import java.util.List;

import my.com.entity.User;
import my.com.service.DangNhapUserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import my.com.entity.khachhang;

import javax.servlet.http.HttpSession;

@Controller
public class TrangChuController {
	@Autowired
	SessionFactory sessionFactory =null;
    @Autowired
    DangNhapUserService dangNhapUserService;
	@RequestMapping("/")
	@Transactional
	public String ViewTrangChu(HttpSession httpSession, ModelMap modelMap) {
	    if(httpSession.getAttribute("user") !=null){
			String username = (String) httpSession.getAttribute("user");
            User user = dangNhapUserService.checkLogin(username);
            int roleid = user.getRole().getRoleid();
            if(roleid!=1){
                modelMap.addAttribute("username",username);
            }
		}
		return "trangchu";
	}

}
