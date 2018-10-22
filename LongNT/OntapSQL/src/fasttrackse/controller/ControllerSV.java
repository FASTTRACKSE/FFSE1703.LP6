package fasttrackse.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fasttrackse.dao.EmDao;
import fasttrackse.entity.DiemHocChinhQuy;
import fasttrackse.entity.SinhVien;
@Controller
public class ControllerSV {
	@Autowired  
    EmDao dao;
	@RequestMapping(value = {"/list" }, method = RequestMethod.GET)
	public String list1(Model model) throws Exception {
		List<SinhVien> list =  dao.getAllStudentWhereNation();
		model.addAttribute( "list", list);
		return "list";
	}
	
	@RequestMapping(value = {"/SVQTVietNam"}, method = RequestMethod.GET)
	public String list2(Model model) throws Exception{
		List<SinhVien> list = dao.getAllStudentWhereNationally();
		model.addAttribute( "list", list);
		return "list2";
	}
	
	@RequestMapping(value = {"/hososinhvien"}, method = RequestMethod.GET)
	public String list3(Model model) throws Exception{
		List<SinhVien> list = dao.getAllStudent();
		model.addAttribute("list", list);
		return "hososinhvien";
	}
	
	@RequestMapping(value = {"/thongkediem"}, method = RequestMethod.GET)
	public String list4(Model model) throws Exception{
		List<DiemHocChinhQuy> list = dao.getAllStudentAndScore();
		model.addAttribute("list", list);
		return "thongkediem";
	}
}
