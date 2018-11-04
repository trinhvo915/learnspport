package my.com.controller;

import java.util.List;

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
	
	@RequestMapping("/")
	@Transactional //@SessionAttribute("user")String Name,
	public String ViewTrangChu(HttpSession httpSession, ModelMap modelMap) {

		if(httpSession.getAttribute("user") !=null){
			String username = (String) httpSession.getAttribute("user");
			//System.out.println(username);
			//String usernamesesion = username.substring(0,4);
			//System.out.println(usernamesesion);
			modelMap.addAttribute("username",username);
		}
//		try {
//			Session session = sessionFactory.getCurrentSession();
//			//String sql1 =" select * From hachhang";
//			List<khachhang> list = session.createQuery("from hachhang ").getResultList();
//
//			for (khachhang khachhang : list) {
//				System.out.println(khachhang.toString());
//			}
//
//		}catch (Exception e){
//
//		}
		modelMap.addAttribute("username1","vo van trinh");
		return "trangchu";
	}

//	@RequestMapping("/dangnhap")
//	public String Login(ModelAndView andView) {
//		return "dangnhap";
//	}
}
