package br.com.babypet.utils.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.babypet.repositories.ClienteRepository;
import br.com.babypet.utils.ApplicationContextProvider;

public class CpfMustBeUniqueValidator implements ConstraintValidator<CpfMustBeUnique,String> {

	private ClienteRepository clienteRepository;
	
	@Override
	public void initialize(CpfMustBeUnique contraintAnnotation) {
		this.clienteRepository = ApplicationContextProvider.getComponent(ClienteRepository.class);
	}
	
	@Override
	public boolean isValid(String cpf, ConstraintValidatorContext context) {
		
		
		
		return !clienteRepository.existsByCpf(cpf);
	}
	
	
}
