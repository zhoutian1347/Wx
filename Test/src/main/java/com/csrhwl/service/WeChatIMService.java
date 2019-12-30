package com.csrhwl.service;

import java.util.List;

import com.csrhwl.entity.WeChatIM;

public interface WeChatIMService {
	
	int saveWeChatInfoMessage(WeChatIM we);

	List<WeChatIM> getUserInfo();
	
}
