package com.api_teste.service;
import com.api_teste.modelo.Cliente;
import com.api_teste.notificacao.Notificador;

//@Component jogar a configuração do Bean na API Config Bean separado

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: " + notificador);
	}


	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
	}
}
