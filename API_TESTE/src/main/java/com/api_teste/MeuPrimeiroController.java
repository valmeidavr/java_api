package com.api_teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.api_teste.modelo.Cliente;
import com.api_teste.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	//Injeção 
	private AtivacaoClienteService ativacaoClienteService;
	
	//Construtor com Injeção de Dependência
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("MeuPrimeiroController: " +  ativacaoClienteService);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente vinicius = new Cliente("Vinicius", "gvweb.solucoes@gmail.com", "24999417827");
		ativacaoClienteService.ativar(vinicius);
		
		return "Hello";
	}
}
