package br.gov.to.egefaz.futurum.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;

import org.springframework.stereotype.Component;

@Component
@ViewScoped
public class TesteController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nome = "TESTE";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
