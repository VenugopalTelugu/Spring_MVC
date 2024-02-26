package com.techpalle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.techpalle.dao.DataAccess;
import com.techpalle.model.Student;

@Controller
public class StudentController {

	@RequestMapping(value="CRUD")
	public ModelAndView getRegisterPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register.jsp");
		
		return mv;
	}
	@RequestMapping(value="reg")
	public ModelAndView insertStudent(HttpServletRequest request) {
		
		String n = request.getParameter("tbName");
		String e = request.getParameter("tbEmail");
		String p = request.getParameter("tbPass");
		Long l = Long.parseLong(request.getParameter("tbMobile"));
		
		Student s = new Student(n, e, p , l);
		
		DataAccess.insert(s);
		
		ModelAndView mv= new ModelAndView();
		
		mv.setViewName("index.jsp");
		
		return mv;
	}
	
}
