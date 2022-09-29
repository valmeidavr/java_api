package com.api_teste;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.api_teste.notificacao.NotificadorEmail;
import com.api_teste.service.AtivacaoClienteService;


//@Configuration
// Não estou usando neste exemplo config agora esta isolada
public class APIConfig {
	//Responsavel agora para instancia NotificadorEmail , uma classe de configuração do Bean 
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.teste.com.br");
		notificador.setCaixaAlta(true);
		return notificador;
	}
	
	@Bean
	//Chamando notificadorEmail() Bean gerenciado acima
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}
