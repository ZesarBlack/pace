package com.pc.usr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pc.usr.beans.BeansUsuarios;
import com.pc.usr.services.impl.ServiceCliente;

@RestController
@RequestMapping("/usuarios")
public class ClienteController {
	@Autowired
	private ServiceCliente serviceCliente;
	@PostMapping("/registro")
	public String RegistroClientes(@RequestBody BeansUsuarios cliente) {
		return serviceCliente.RegistroClienteService(cliente);
	}
}
