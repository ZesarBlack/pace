package com.pc.usr.services.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.usr.beans.BeansUsuarios;
import com.pc.usr.services.ServiceClienteInterfaz;
import com.pc.usr.cliente.impl.ClienteRegistro;

@Service
public class ServiceCliente implements ServiceClienteInterfaz{
	
	@Autowired
	private ClienteRegistro clienteRegistro;
	@Override
	public String RegistroClienteService(BeansUsuarios cliente) {
		String mensaje = "";
		mensaje = clienteRegistro.RegistroCliente(cliente);
		return mensaje;
	}

}
