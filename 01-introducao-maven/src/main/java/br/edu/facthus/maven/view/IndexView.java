package br.edu.facthus.maven.view;

import java.time.LocalDateTime;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexView {
	
	private LocalDateTime dthrAtual = LocalDateTime.now();
	
	private String nome;
	
	public String getMensagem() {
		String novoNome = "";
		if (nome != null)
			novoNome = nome;
		
		if (dthrAtual.getHour() < 12)
			return String.format("Bom dia %s! Seja bem vindo(a)!", novoNome);
		else if (dthrAtual.getHour() < 18)
			return String.format("Boa tarde %s! Seja bem vindo(a)!", novoNome);
		else
			return String.format("Boa noite %s! Seja bem vindo(a)!", novoNome);
	}
	
	public LocalDateTime getDthrAtual() {
		System.out.println(dthrAtual);
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
