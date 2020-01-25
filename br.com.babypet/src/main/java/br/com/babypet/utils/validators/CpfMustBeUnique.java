package br.com.babypet.utils.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CpfMustBeUniqueValidator.class)
public @interface CpfMustBeUnique {

	public String message() default "CPF já cadastrado";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default{};
}
