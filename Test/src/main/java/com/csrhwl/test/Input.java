package com.csrhwl.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Input {
	public static void main(String[] args) {
//		方正国际 谈德华 网络团队
		String encoding = "UTF-8";
		List<Object> list = new ArrayList<>();
		File file = new File("d:/key/1.txt");
		if(file.isFile() && file.exists()) {
			try {
				InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
				BufferedReader br = new BufferedReader(read);
				String lineText = null;
				try {
					while((lineText = br.readLine()) != null) {
						System.out.println(lineText);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			} catch (UnsupportedEncodingException e) {
				System.out.println("不支持的编码类型："+encoding);
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				System.out.println("文件不存在");
				e.printStackTrace();
			}
		}else {
			System.out.println("文件不存在");
		}
		
	}
}
