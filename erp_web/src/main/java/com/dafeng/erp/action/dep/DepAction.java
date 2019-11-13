package com.dafeng.erp.action.dep;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.dafeng.erp.action.util.Result;
import com.dafeng.erp.biz.IDepBiz;
import com.dafeng.erp.entity.Dep;

/** 
  * @ClassName: DepAction 
  * <p>业务描述：</p>
  * @author 大风
  * @date 2019年11月13日 上午10:44:46 
  * @version v1.0 
*/
public class DepAction {
//	属性驱动：条件查询
	private Dep dep;
	public Dep getDep() {
		return dep;
	}
	public void setDep(Dep dep) {
		this.dep = dep;
	}
	private int page;
	private int limit;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	private IDepBiz depBiz;
	public void setDepBiz(IDepBiz depBiz) {
		this.depBiz = depBiz;
	}
	
	public void list() {
		System.out.println(page+""+limit);
		Result result = new Result();
		result.setData( depBiz.findAll());
		String jsonString = JSON.toJSONString(result);
		write(jsonString);
	}
	
	public void search() {
//		System.out.println(dep);
		Result result = new Result();
		result.setData( depBiz.getList(dep));
		String jsonString = JSON.toJSONString(result);
		write(jsonString);
	}
	
	public void write(String jsonString) {
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(jsonString);
		} catch (Exception e) {
		}
	}
}
