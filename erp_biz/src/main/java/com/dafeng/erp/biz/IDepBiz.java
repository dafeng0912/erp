package com.dafeng.erp.biz;

import java.util.List;

import com.dafeng.erp.entity.Dep;

/** 
  * @ClassName: IDepBiz 
  * <p>业务描述: 部门业务接口</p>
  * @author 大风
  * @date 2019年11月13日 上午10:35:25 
  * @version v1.0 
*/
public interface IDepBiz {
	
	List<Dep> findAll();
	
	List<Dep> getList(Dep dep);
}
