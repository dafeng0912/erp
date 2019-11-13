package com.dafeng.erp.entity;

/** 
  * @ClassName: Dep 
  * <p>业务描述：</p>
  * @author 大风
  * @date 2019年11月12日 下午5:15:55 
  * @version v1.0 
*/
public class Dep {
		
	private long uuid;
	
	private String name;
	
	private String tele;

	public long getUuid() {
		return uuid;
	}

	public void setUuid(long uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	@Override
	public String toString() {
		return "Dep [uuid=" + uuid + ", name=" + name + ", tele=" + tele + "]";
	}

	
	
}
