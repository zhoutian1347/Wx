package com.csrhwl.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wx {
	private String callback_token;
	private String encoding_aeskey;
	private String callback_encrypt_mode;
	private String operation_seq;
	private String action;
	private String type;
	
	
}
