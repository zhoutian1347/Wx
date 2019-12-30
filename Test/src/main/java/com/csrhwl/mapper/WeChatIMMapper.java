package com.csrhwl.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.csrhwl.entity.WeChatIM;

public interface WeChatIMMapper {
	
	int saveWeChatInfoMessage(WeChatIM we);

	@Select("select * from wx_user_info where avatar_url = #{avatarUrl} and create_time = #{createTime}")
	WeChatIM selectUserByAvatarUrl(@Param("avatarUrl")String avatarUrl,@Param("createTime")String createTime);
	
}
