package com.csrhwl.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WeChatIM {
	private Integer id;
	private String realName;
	private String nickName;
	private String avatarUrl;
	private String createTime;
	
}
