package com.guiyideguang.panta.zhen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class index {

	@RequestMapping(value="/index")
	public ModelAndView index(ModelAndView mv){
		mv.setViewName("index");
		return mv;
	}
}
