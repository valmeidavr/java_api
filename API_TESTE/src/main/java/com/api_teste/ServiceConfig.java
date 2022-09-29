package com.api_teste;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api_teste.notificacao.Notificador;
import com.api_teste.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
