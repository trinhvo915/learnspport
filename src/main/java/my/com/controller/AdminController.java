package my.com.controller;

import my.com.entity.Chuong;
import my.com.entity.MonHoc;
import my.com.entity.User;
import my.com.service.ChuongService;
import my.com.service.DangNhapUserService;
import my.com.service.DanhMucService;
import my.com.utils.ConvertTimesamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

	@Autowired
	ChuongService chuongService;

	@GetMapping
	@Transactional
	public String Default(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		return "admin/homeadmin";
	}

	@GetMapping
	@Transactional
	@RequestMapping("/setting")
	public String Setting(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		return "admin/setting";
	}

	@GetMapping
	@Transactional
	@RequestMapping("/newpost")
	public String NewPost(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		return "admin/newpost";
	}

	@GetMapping
	@Transactional
	@RequestMapping("/listpost")
	public String ListPost(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		return "admin/listPost";
	}

	@GetMapping
	@Transactional
	@RequestMapping("/listUser")
	public String ListUser(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		return "admin/listuser";
	}

	@GetMapping
	@Transactional
	@RequestMapping("/newUser")
	public String NewUser(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		return "admin/newuser";
	}

	/***************** Controller cho danh mục *******************/
	@GetMapping
	@Transactional
	@RequestMapping("/listDanhMuc")
	public String ListDanhMuc(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		ArrayList<MonHoc> listMocHoc = danhMucService.listDanhMuc();
		modelMap.addAttribute("listdm", listMocHoc);
		return "admin/listdanhmuc";
	}

	@GetMapping
	@Transactional
	@RequestMapping("/newDanhMuc")
	public String NewDanhMuc(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		modelMap.addAttribute("danhmuc", new MonHoc());
		return "admin/newdanhmuc";
	}

	@Transactional
	@RequestMapping(value = "/listDanhMuc/delete", method = {RequestMethod.GET, RequestMethod.POST})
	public String DeleteUser(HttpServletRequest req, @SessionAttribute("user") String username, ModelMap modelMap) {//@PathVariable("id") int id,
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		Integer idmonhoc = Integer.valueOf(req.getParameter("idmonhoc"));
		String successful = danhMucService.deleleMonhoc(idmonhoc);
		// thực hiện xóa xong thì thông báo và hiển thị lại list
		if (successful != null) {
			modelMap.addAttribute("successful", "Delete " + successful);
			ArrayList<MonHoc> listMocHoc = danhMucService.listDanhMuc();
			modelMap.addAttribute("listdm", listMocHoc);
			return "admin/listdanhmuc";
		} else {
			modelMap.addAttribute("Unsuccessful", "Xóa không thành công " + idmonhoc + " không tồn tại.");
			ArrayList<MonHoc> listMocHoc = danhMucService.listDanhMuc();
			modelMap.addAttribute("listdm", listMocHoc);
			return "admin/listdanhmuc";
		}
	}

	@GetMapping
	@Transactional
	@RequestMapping("/add")
	public String AddDanhMuc(@SessionAttribute("user") String username, ModelMap modelMap,
							 @ModelAttribute(value = "danhmuc") MonHoc monHoc) { //,@RequestParam String nameMonHoc
		try {
			User user = nhapUserService.checkLogin(username);
			String name = user.getProfile().getName();
			modelMap.addAttribute("username", name);
			String result = danhMucService.SaveorUpdate(monHoc);
			if (result.equalsIgnoreCase("add")) {
				modelMap.addAttribute("result", "Thêm Thành Công");
			}
		} catch (Exception e) {
			return "admin/newdanhmuc";
		}
		return "admin/newdanhmuc";
	}

	@Transactional
	@RequestMapping(value = "/listDanhMuc/update", method = {RequestMethod.GET, RequestMethod.POST})
	public String UpdateUser(HttpServletRequest req, @SessionAttribute("user") String username, ModelMap modelMap) {//@PathVariable("id") int id,
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		Integer idmonhoc = Integer.valueOf(req.getParameter("idmonhoc"));
		MonHoc monHoc = danhMucService.findById(idmonhoc);
		if (monHoc != null) {
			modelMap.addAttribute("danhmucupdate", monHoc);
			return "admin/newdanhmuc";
		}
		return "admin/listdanhmuc";
	}

	@GetMapping
	@Transactional
	@RequestMapping("/edit")
	public String EditDanhMuc(@SessionAttribute("user") String username, ModelMap modelMap,
							  @ModelAttribute("danhmucupdate") MonHoc monHoc) { //,@RequestParam String nameMonHoc
		try {
			User user = nhapUserService.checkLogin(username);
			String name = user.getProfile().getName();
			modelMap.addAttribute("username", name);
			//Timestamp date = ConvertTimesamp.converStringtoTimestamp(createday);
			//MonHoc monHoc = new MonHoc(nameMonHoc);
			String result = danhMucService.SaveorUpdate(monHoc);
			modelMap.addAttribute("result", result);
			ArrayList<MonHoc> listMocHoc = danhMucService.listDanhMuc();
			modelMap.addAttribute("listdm", listMocHoc);
		} catch (Exception e) {
			return "admin/newdanhmuc";
		}
		return "admin/listdanhmuc";

	}
	/***************** Controller cho danh mục *******************/
	//**********************************************************************//

	/***************** Controller cho quan ly chuong *******************/
	@GetMapping
	@Transactional
	@RequestMapping("/listchuong")
	public String ListChuong(@SessionAttribute("user") String username, ModelMap modelMap) {
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		return "admin/chuong/listchuong";
	}

	@Transactional
	@RequestMapping(value = "/listchuong/idchuong", method = {RequestMethod.GET, RequestMethod.POST})
	public String ListChuongId(HttpServletRequest req, @SessionAttribute("user") String username, ModelMap modelMap) {//@PathVariable("id") int id,
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		Integer idchuong = Integer.valueOf(req.getParameter("idchuong"));
		ArrayList<Chuong> chuongs = chuongService.listChuong(idchuong);
		if (chuongs.size() != 0) {
			modelMap.addAttribute("listchuong", chuongs);
			modelMap.addAttribute("id", idchuong);
			return "admin/chuong/listchuong";
		} else if (chuongs == null) {
			ArrayList<MonHoc> listMocHoc = danhMucService.listDanhMuc();
			modelMap.addAttribute("listdm", listMocHoc);
			return "admin/listdanhmuc";
		}
		return "";

	}
	@Transactional
	@RequestMapping(value = "/listDanhMuc/delete/chuong", method = {RequestMethod.GET, RequestMethod.POST})
	public String DeleteChuong(HttpServletRequest req, @SessionAttribute("user") String username, ModelMap modelMap) {//@PathVariable("id") int id,
		User user = nhapUserService.checkLogin(username);
		String name = user.getProfile().getName();
		modelMap.addAttribute("username", name);
		Integer idchuong = Integer.valueOf(req.getParameter("idchuong"));
		String successful = chuongService.deleleChuong(idchuong);
		// thực hiện xóa xong thì thông báo và hiển thị lại list
		return null;
	}
	/***************** Controller cho quan ly chuong *******************/
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
