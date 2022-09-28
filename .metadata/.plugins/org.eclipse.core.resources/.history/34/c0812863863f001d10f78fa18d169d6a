package com.api_teste.notificacao;

import org.springframework.stereotype.Component;

import com.api_teste.modelo.Cliente;

@Component
public class NotificadorEmail {

	public NotificadorEmail() {
		System.out.println("Construtor Chamado");
	}
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
