package br.com.babypet.dtos.commands;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import br.com.babypet.utils.validators.CommandValidator;
import br.com.babypet.utils.validators.CpfMustBeUnique;
import br.com.babypet.utils.validators.CpfMustBeValid;

public class ClienteInsertCommand {

	@NotBlank(message = " Nome deve ser informado parça ")
	private String nome;
	@NotBlank(message = " CPF deve ser informado amigo ")
	@CpfMustBeValid
	@CpfMustBeUnique
	private String cpf;
	@NotBlank(message = " Email deve ser informado man ")
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
	
	public void validate() {
		CommandValidator<ClienteInsertCommand> commandValidator = new CommandValidator<>();
		
		commandValidator.Validate(this);
	}

}