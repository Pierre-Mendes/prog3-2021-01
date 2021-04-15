package br.edu.facthus.maven.view;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Exercicio04View {
	
	private String dtNascimentoStr;
	
	private String saida;

	public void calculaIdade() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataNascimento = 
				LocalDate.parse(dtNascimentoStr,
						DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Period periodo = Period.between(dataNascimento, dataAtual);
		saida = String.format("Você tem %d anos.", periodo.getYears());
	}
	
	public String getDtNascimentoStr() {
		return dtNascimentoStr;
	}

	public void setDtNascimentoStr(String dtNascimentoStr) {
		this.dtNascimentoStr = dtNascimentoStr;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
	
}
