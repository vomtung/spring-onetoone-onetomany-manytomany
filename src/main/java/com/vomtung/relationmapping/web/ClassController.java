package com.vomtung.relationmapping.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vomtung.relationmapping.entity.SchoolClass;
import com.vomtung.relationmapping.service.SchoolClassService;

@Controller
@RequestMapping(value="/class")
public class ClassController {
	
	@Autowired
	SchoolClassService schoolClassService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "schoolclass/list";
	}
	
	@RequestMapping(value="/addnew",method=RequestMethod.GET)
	@Transactional
	public String addStudentPage(ModelMap mm) {
		mm.addAttribute("schoolClass", new SchoolClass());
		return "schoolclass/add";
	}
	
	@RequestMapping(value="/addnew",method=RequestMethod.POST)
	public String addNewStudent(@ModelAttribute(value = "schoolClass") SchoolClass schoolClass) {
		schoolClassService.addClass(schoolClass);
		return "schoolclass/list";
	}

}
