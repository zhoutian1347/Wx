package com.csrhwl.service.impl;

import java.util.Date;

import org.beetl.ext.format.DateFormat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csrhwl.entity.WeChatIM;
import com.csrhwl.mapper.WeChatIMMapper;
import com.csrhwl.service.WeChatIMService;

@Service
public class WeChatIMServiceImpl implements WeChatIMService{
	
	@Autowired
	private WeChatIMMapper weMapper;
	
	@Override
	public int saveWeChatInfoMessage(WeChatIM we) {
		int rows = 0;
		we.setCreateTime(new DateFormat().format(new Date(), "yyyy-MM-dd").toString());
		WeChatIM already = weMapper.selectUserByAvatarUrl(we.getAvatarUrl(),we.getCreateTime());
		if(already==null) {
			rows = weMapper.saveWeChatInfoMessage(we);
		}else {
			return 4;
		}
		
		System.out.println(rows+",,,,,,"+we);
		return rows;
	}
	
	@Test
	public void tes() {
		DateFormat df = new DateFormat();
		Date data = new Date();
		String s = df.format(data, "yyyy-MM-dd").toString();
		System.out.println(s);
	}
	
	
}
