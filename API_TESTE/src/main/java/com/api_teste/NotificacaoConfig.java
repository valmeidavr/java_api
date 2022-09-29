package com.api_teste;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api_teste.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.teste.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
}
