package com.csrhwl.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.csrhwl.entity.User;
import com.csrhwl.entity.WeChatIM;
import com.csrhwl.entity.Wx;
import com.csrhwl.service.WeChatIMService;
import com.csrhwl.util.JsonResult;

@Controller
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private WeChatIMService weService;
	
	@RequestMapping(value="user")
    public String index(Model model) {
		System.out.println("aaa");
        List<User> users = new ArrayList<User>();
        users.add(new User("皮皮虾", "男", "喜欢皮"));
        users.add(new User("光头强", "男", "砍树"));
        users.add(new User("佩奇", "男", "叫"));
        model.addAttribute("users",users);
        return "user";
    }
	
	@RequestMapping("test")
	@ResponseBody
	public String test(Wx wx) {
		System.out.println(wx);
		return "test";
	}
	
	@RequestMapping("WeChatIM")
	@ResponseBody
	public String WeChatIM(WeChatIM we) {
		System.out.println(we);
		weService.saveWeChatInfoMessage(we);
		return we.toString();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping("getUserInfo")
	@ResponseBody
	public JsonResult<List<WeChatIM>> getUserInfo() {
		List<WeChatIM> list = weService.getUserInfo();
		String json = JSONArray.toJSONString(list);
		return new JsonResult<List<WeChatIM>>(list);
	}
	
}
