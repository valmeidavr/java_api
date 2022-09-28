package com.api_teste.notificacao;

import com.api_teste.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}