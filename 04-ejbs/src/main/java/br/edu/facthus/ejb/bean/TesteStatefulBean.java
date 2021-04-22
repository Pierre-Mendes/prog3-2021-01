package br.edu.facthus.ejb.bean;

import javax.ejb.Stateful;

@Stateful
public class TesteStatefulBean implements ITesteStatefulBean {

	private Integer n = 0;
	
	@Override
	public String ola() {
		n++;
		return String.format("%s - n = %d", this.toString(), n);
	}

}
