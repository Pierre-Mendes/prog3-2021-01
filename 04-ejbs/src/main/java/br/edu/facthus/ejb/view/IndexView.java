package br.edu.facthus.ejb.view;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.facthus.ejb.bean.ITesteSingletonBean;
import br.edu.facthus.ejb.bean.ITesteStatefulBean;
import br.edu.facthus.ejb.bean.ITesteStatelessBean;

@Named
@ViewScoped
public class IndexView implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private ITesteStatelessBean statelessBean;
	
	@Inject
	private ITesteStatefulBean statefulBean;
	
	@Inject
	private ITesteSingletonBean singletonBean;
		
	public void stateless() {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(statelessBean.ola()));
	}
	
	public void stateful() {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(statefulBean.ola()));
	}
	
	public void singleton() {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(singletonBean.ola()));
	}
		
}
