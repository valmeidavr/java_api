package com.api_teste.notificacao;

import org.springframework.stereotype.Component;

import com.api_teste.modelo.Cliente;

//@Component mudando a instancia para uma configuração

public class NotificadorEmail implements Notificador {

	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	//Construtor esta pedindo entrada , o bean tem que ser ajustado para receber entradas
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", 
					cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}


	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
}
