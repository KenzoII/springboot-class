package br.com.babypet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.babypet.domain.Cliente;
import br.com.babypet.services.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping("clientes")
	public ResponseEntity<?> inserir() {

		Cliente cliente = clienteService.incluir("Kenzo", "12345678910", "email@teste.com.br");

		return ResponseEntity.ok(cliente);

	}
}
