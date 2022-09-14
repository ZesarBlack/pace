package com.pc.usr.cliente.impl;
import org.springframework.stereotype.Component;

import com.pc.usr.beans.BeansUsuarios;
import com.pc.usr.cliente.InterfazCliente;

@Component
public class ClienteRegistro implements InterfazCliente{
	@Override
	public String RegistroCliente(BeansUsuarios cliente) {
		String mensaje ="";
		System.out.print(cliente.getMaterno()+cliente.getPaterno()+cliente.getNombre()+cliente.getEdad());
		// TODO Auto-generated method stub
		if(cliente.getMaterno() != null && cliente.getPaterno() != null && cliente.getNombre() != null) {
			mensaje = "todo correcto";
		}else {
			mensaje = "faltan algunos datos";
		}
		return mensaje;
	}


}