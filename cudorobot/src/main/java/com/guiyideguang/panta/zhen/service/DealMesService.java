package com.guiyideguang.panta.zhen.service;

import com.guiyideguang.panta.zhen.bean.MyResult;
import com.guiyideguang.panta.zhen.bean.Slot;
import com.guiyideguang.panta.zhen.dao.PhoneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealMesService {
	@Autowired
	private PhoneMapper pm;
	public String	returnMes(MyResult mr)
  {
  	if(mr.getIntent().equals("FAQ_NEW_HELP"))
	{
		return mr.getActionList().get(0).getSay();
	}
  	if(mr.getIntent().equals("FAQ_ANSWER_PHONE"))
	{
		return mr.getActionList().get(0).getSay();
	}
  	if(mr.getIntent().equals("SEARCH_PHONE"))
	{
		String version="";
		Boolean flag1=false;
		Boolean flag2=false;
		String doctype="";
       for(Slot slot:mr.getSlots())
	   {


           if("user_version".equals(slot.getName()))
		   {
		   	   version=slot.getOriginal_word().trim();
			    flag1=true;
		   }
           if("user_phone_doc_type".equals(slot.getName()))
		   {
			   System.out.println(slot.getOriginal_word());
			   System.out.println(slot.getNormalized_word());
 				flag2=true;
 				if("使用说明书".equals(slot.getNormalized_word()))
				{
					System.out.println("匹配成功");
					doctype="op";
				}
			   if("产品规格参数文档".equals(slot.getNormalized_word()))
			   {
				   System.out.println("匹配成功");
				   doctype="doc";
			   }
			   if("售后手册".equals(slot.getNormalized_word()))
			   {
				   System.out.println("匹配成功");
				   doctype="afsale";
			   }
		   }
	   }
       if(flag1&&flag2)
	   {
            if("doc".equals(doctype))
            {
                  return pm.selectdocByVer(version);
			}
		   if("op".equals(doctype))
		   {
			   return pm.selectopByVer(version);
		   }
		   if("afsale".equals(doctype))
		   {
			   return pm.selectafsaleByVer(version);
		   }
	   }
	}
  	return "请澄清您的手机型号或者查询的文档，或者输入帮助";
  }
}
