package com.example.demo.controller;

import java.util.*;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.*;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		//salary 객체 리스트 변수
		List<SalaryModel> salaryList = new ArrayList<SalaryModel>();
		
		
		//Salary model
		SalaryModel salaryModel = new SalaryModel();
		
		// 첫 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(1);
		salaryModel.setName("AAA");
		salaryModel.setEmail("AAA@example.com");		
		salaryList.add(salaryModel);
		
		
		// 두 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(2);
		salaryModel.setName("BBB");
		salaryModel.setEmail("BBB@example.com");
		salaryList.add(salaryModel);

		
		// 세 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(3);
		salaryModel.setName("CCC");
		salaryModel.setEmail("CCC@example.com");
		salaryList.add(salaryModel);
		
		
		mav.addObject("salaryList",salaryList);
		mav.setViewName("content/home");
		
		return mav;
	}
}