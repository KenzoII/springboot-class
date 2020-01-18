package br.com.babypet.utils;

public class NotFoundException extends RuntimeException {
	
	
	public NotFoundException() {
		super ("NotFoundException");	
	}
	
	public NotFoundException(String message) {
		super(message);
	}
	
}

