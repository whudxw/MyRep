package com.guiyideguang.panta.zhen.service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.guiyideguang.panta.zhen.bean.*;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSONObject;
import com.guiyideguang.panta.zhen.util.HttpUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class SendMessage {
	public static String UNIT_URL ="https://aip.baidubce.com/rpc/2.0/unit/bot/chat";
	public String sendMes(String query)
	{
		//另一个的ak  sk;
//		String access=new AuthService().getAuth("jI6vZOE4Cc7LrC15XfYa1i6S","hGb0zAVeqCYG1vG80EI2KudUrPqhMUSQ");
//		try {
//			return getUNITV2Result("40039", query,  access);
		String access=new AuthService().getAuth("cvFSlEGy36Um45TEd3Yd5WDb","XZOQKR5VqEhNRTvo4C7p9rvdECzee4Sv");
		try {
			return getUNITV2Result("41789", query,  access);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";
	}
	public MyResult transobj(String s)
	{
		ReplyBean rb= JSON.parseObject(s,new TypeReference<ReplyBean>() {});
		System.out.println(rb);
		SchemeBean sb=rb.getResult().getResponse().getSchema();
		String intent=sb.getIntent();
		System.out.println("置信度1为"+sb.getIntent_confidence());
		float intent_confidence=sb.getIntent_confidence();
		List<Slot> slots=sb.getSlots();
        List<ActionBean> actions=rb.getResult().getResponse().getAction_list();
		MyResult mr=new MyResult();
		mr.setIntent(intent);
		mr.setSlots(slots);
        mr.setConfidence(intent_confidence);
        System.out.println("置信度2为"+mr.getConfidence());
        mr.setActionList(actions);
        return mr;
	}
	public static String getUNITV2Result(String bot_id,String query,String access_token) throws Exception{
		UnitV2RequestBean bean = new UnitV2RequestBean();
		bean.setVersion("2.0");
		bean.setBot_id(bot_id);
		bean.setLog_id("XS"+System.currentTimeMillis());
		UnitV2RequestBean.Request request = new UnitV2RequestBean.Request();
		request.setUser_id("XS0001");//测试设置 大家请自行更改
		request.setQuery(query);
		UnitV2RequestBean.QueryInfo query_info = new UnitV2RequestBean.QueryInfo();
		query_info.setType("TEXT");
		query_info.setSource("KEYBOARD");
		request.setQuery_info(query_info);
		request.setBernard_level(1);
		//希望传给bot的本地信息
		/**
		 * ClientSession所需要的是字符串类型 内容为json格式
		 * "client_session": "{\"candidate_options\": [\"123\", \"456\"], \"client_results\": \"hhhh\"}"
		 */
		UnitV2RequestBean.ClientSession client_session = new UnitV2RequestBean.ClientSession();
		client_session.setClient_results("");
		List candidate_options = new ArrayList();
		client_session.setCandidate_options(candidate_options);
		String client_sessionparam = JSONObject.toJSONString(client_session);
		request.setClient_session(client_sessionparam);
		bean.setRequest(request);
		bean.setBot_session("");
		String jsonparam = JSONObject.toJSONString(bean);
		System.out.println("参数"+jsonparam);
		UnitV2RequestBean obj= JSON.parseObject(jsonparam,UnitV2RequestBean.class);
		System.out.println("duixiang"+obj.toString());
		String result = HttpUtil.post(UNIT_URL, access_token, "application/json", jsonparam);
		return result;
	}
}