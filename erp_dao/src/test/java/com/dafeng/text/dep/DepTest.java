package com.dafeng.text.dep;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dafeng.erp.dao.IDepDao;
import com.dafeng.erp.dao.impl.DepDao;

/** 
  * @ClassName: DepTest 
  * <p>业务描述：</p>
  * @author 大风
  * @date 2019年11月13日 上午9:11:34 
  * @version v1.0 
*/
public class DepTest {

	@Test
	public void testDepDao() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:applicationContext_*.xml");
		IDepDao depDao = (DepDao)ac.getBean("depDao");
		System.out.println(depDao.findAll());
//		Object bean = ac.getBean("sessionFactory");
		
	}
	
}
