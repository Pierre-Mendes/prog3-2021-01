package br.edu.facthus.maven.view;

import java.time.LocalDateTime;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexView {
	
	private LocalDateTime dthrAtual = LocalDateTime.now();
	
	private String nome;
	
	// Retorna a mensagem personalizada
	// Bom dia: até 12 horas
	// Boa tarde: de 12 às 18 horas
	// Boa noite: após as 18 horas 
	public String getMensagem() {
		String mensagem = null;
		if (dthrAtual.getHour() < 12)
			mensagem = "Bom dia";
		else if (dthrAtual.getHour() < 18)
			mensagem = "Boa tarde";
		else
			mensagem = "Boa noite";
			
		return String.format("%s %s! Seja bem vindo(a)!", mensagem, nome);
	}
	
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
