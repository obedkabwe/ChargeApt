package com.oberson.charge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oberson.charge.model.Titulo;




@Controller
@RequestMapping(value= "/titulos")
public class TituloController {
	
	@RequestMapping("/novo")
	public String novo() {
		return "CadastroTitulo";
	}	
	
	
	@RequestMapping(method = RequestMethod.POST)	
	public String salvar(Titulo titulo) {
		System.out.println("" + titulo.getDescricao());
		return "CadastroTitulo";
	}
	
	
	
	
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

