package com.lambda.Javagua.DTOS;

import com.lambda.Javagua.Model.Cliente;

public class ClienteDTO {

	public ClienteDTO(Cliente cliente) {

		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.cep = cliente.getCep();
		this.email = cliente.getEmail();
		this.telefone = cliente.getTelefone();
	}

	private Long id;
	private String nome;
	private String cep;
	private String email;
	private String telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
