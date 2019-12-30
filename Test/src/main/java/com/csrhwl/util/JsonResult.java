package com.csrhwl.util;

import java.io.Serializable;

@lombok.Data
public class JsonResult<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final int SUCCESS=0;
	public static final int ERROR=1;
	public static final int OTHER=2;
	
	private int state;
	private boolean success;
	private T data;
	private String pass;
	
	public JsonResult() {
		state = SUCCESS;
		success = true;
	}
	
	public JsonResult(int state,boolean success,T data) {
		super();
		this.state = state;
		this.success = success;
		this.data = data;
	}
	
	public JsonResult(int state,boolean success){
        this(state,true,null);
    }
    public JsonResult(int state,T data){
        this(state,true,data);
    }
    public JsonResult(String error){
        this(ERROR,false,null);
    }

    public JsonResult(T data){
        this(SUCCESS,true,data);
    }
    public JsonResult(int state){
        this(state,true,null);
    }
    public JsonResult(Throwable e){
        this(ERROR,false,null);
    }
	
}
