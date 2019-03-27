package com.guiyideguang.panta.zhen.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.guiyideguang.panta.zhen.bean.MyResult;
import com.guiyideguang.panta.zhen.bean.ReplyBean;
import com.guiyideguang.panta.zhen.bean.SchemeBean;
import com.guiyideguang.panta.zhen.service.DealMesService;
import com.guiyideguang.panta.zhen.service.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SendMessageController {
	@Autowired
	private SendMessage sendmes;
	@Autowired
	private DealMesService dms;
	@RequestMapping(value="/sendmes")
	public ModelAndView sendmes(ModelAndView mv,@RequestParam("mes") String mes)
	{
        String s=sendmes.sendMes(mes);
		MyResult mr=sendmes.transobj(s);
		String result=dms.returnMes(mr);
		mv.addObject("result",result);
		mv.addObject("mr",mr);
		mv.setViewName("index");
		return mv;
}
}
