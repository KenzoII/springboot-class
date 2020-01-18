package br.com.babypet.dtos.commands;

import javax.validation.constraints.NotBlank;

public class ClienteInsertCommand {

	@NotBlank(message = "Nome deve ser informado parça")
	private String nome;
	@NotBlank(message = "CPF deve ser informado amigo")
	private String cpf;
	@NotBlank(message = "Nome deve ser informado man")
	private String email;

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

}
