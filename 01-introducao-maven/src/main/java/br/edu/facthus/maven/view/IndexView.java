package br.edu.facthus.maven.view;

import java.time.LocalDateTime;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexView {
	
	private LocalDateTime dthrAtual = LocalDateTime.now();
	
	public LocalDateTime getDthrAtual() {
		System.out.println(dthrAtual);
		return dthrAtual;
	}

	public void setDthrAtual(LocalDateTime dthrAtual) {
		this.dthrAtual = dthrAtual;
	}

}
