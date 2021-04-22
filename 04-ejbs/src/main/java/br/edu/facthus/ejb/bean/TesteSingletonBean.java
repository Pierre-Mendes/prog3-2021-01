package br.edu.facthus.ejb.bean;

import javax.ejb.Singleton;

@Singleton
public class TesteSingletonBean implements ITesteSingletonBean {

	private Integer n = 0;
	
	@Override
	public String ola() {
		n++;
		return String.format("%s - n = %d", this.toString(), n);
	}

}
