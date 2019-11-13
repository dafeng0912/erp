package com.dafeng.erp.action.util;

import java.util.List;

/** 
  * @ClassName: Result 
  * <p>业务描述：</p>
  * @author 大风
  * @date 2019年11月13日 上午10:50:41 
  * @version v1.0 
*/
public class Result {
	 private Integer code = 0;
	  
	  private String msg = "";
	  
	  private int count;
	  
	  private List data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
		this.count=data.size();
	}

	  
}
