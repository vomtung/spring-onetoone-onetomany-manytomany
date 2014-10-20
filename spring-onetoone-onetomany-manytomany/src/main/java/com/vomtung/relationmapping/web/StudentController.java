package com.vomtung.relationmapping.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vomtung.relationmapping.entity.Student;


@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@InitBinder
	protected void initBinder(HttpServletRequest request,ServletRequestDataBinder binder) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "student/list";
	}
	
	@RequestMapping(value="/addnew",method=RequestMethod.GET)
	public String addStudentPage(ModelMap mm) {
		mm.addAttribute("student", new Student());
		return "student/add";
	}
	
	@RequestMapping(value="/addnew",method=RequestMethod.POST)
	public String addNewStudent(@ModelAttribute(value = "student") Student student) {
		
		return "student/list";
	}
}
