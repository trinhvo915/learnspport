package my.com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import my.com.entity.khachhang;

@Controller
public class TrangChuController {
	@Autowired
	SessionFactory sessionFactory =null;
	
	@RequestMapping("/")
	@Transactional
	public ModelAndView ViewTrangChu() {
		try {
			Session session = sessionFactory.getCurrentSession();
			//String sql1 =" select * From hachhang";
			List<khachhang> list = session.createQuery("from hachhang").getResultList();

			for (khachhang khachhang : list) {
				System.out.println(khachhang.toString());
			}

		}catch (Exception e){

		}
		 
		ModelAndView account = new ModelAndView();	
		account.setViewName("trangchu");
		return account;
	}
	
//	@RequestMapping("/dangnhap")
//	public String Login(ModelAndView andView) {
//		return "dangnhap";
//	}
}
