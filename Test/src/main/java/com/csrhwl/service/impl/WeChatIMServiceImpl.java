package com.csrhwl.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		we.setCreateTime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString());
		WeChatIM already = weMapper.selectUserByAvatarUrl(we.getAvatarUrl(),we.getCreateTime());
		if(already==null) {
			rows = weMapper.saveWeChatInfoMessage(we);
		}else {
			System.out.println("重复数据，放弃存储");
			return 4;
		}
		
		System.out.println(rows+",,,,,,"+we);
		return rows;
	}
	
	@Override
	public List<WeChatIM> getUserInfo() {
		List<WeChatIM> list = new ArrayList<WeChatIM>();
		list = weMapper.selectAllUser();
		return list;
	}
	
	
}
