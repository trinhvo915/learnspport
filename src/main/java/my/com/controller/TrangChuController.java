package my.com.controller;
import java.sql.Date;
import my.com.entity.Role;
import my.com.entity.User;
import my.com.service.DangNhapUserService;
import my.com.service.DanhMucService;
import my.com.utils.ConvertTimesamp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller
public class TrangChuController {
	@Autowired
	SessionFactory sessionFactory =null;
    @Autowired
    DangNhapUserService dangNhapUserService;
	@Autowired
	DanhMucService danhMucService;
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
		Session session = sessionFactory.getCurrentSession();
	    //String ngay = "2009-12-23";
//		Date date = ConvertTimesamp.converStringtoDate();
//		Role role = new Role("NguoiDung",date);
//		session.save(role);
		modelMap.addAttribute("listdanhmuc",danhMucService.listDanhMuc());
		return "trangchu";
	}


}
