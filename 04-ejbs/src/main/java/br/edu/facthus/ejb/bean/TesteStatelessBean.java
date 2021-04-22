package br.edu.facthus.ejb.bean;

import javax.ejb.Stateless;

@Stateless
public class TesteStatelessBean implements ITesteStatelessBean {

	private Integer n = 0;
	
	@Override
	public String ola() {
		n++;
		return String.format("%s - n = %d", this.toString(), n);
	}

}
