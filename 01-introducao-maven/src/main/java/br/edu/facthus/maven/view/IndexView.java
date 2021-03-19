package br.edu.facthus.maven.view;

import java.time.LocalDateTime;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexView {
	
	private LocalDateTime dthrAtual = LocalDateTime.now();
	
	private String nome;
	
	public LocalDateTime getDthrAtual() {
		return dthrAtual;
	}

	public void setDthrAtual(LocalDateTime dthrAtual) {
		this.dthrAtual = dthrAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
