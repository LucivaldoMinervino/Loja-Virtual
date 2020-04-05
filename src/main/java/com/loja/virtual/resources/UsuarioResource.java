package com.loja.virtual.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.virtual.entities.Usuario;

@RequestMapping(value="/usuarios")
@RestController
public class UsuarioResource {
	
	//PARA TESTE (  PASSO 1 ) testar localHost h2
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		
		Usuario u = new Usuario( 1L,"lUCIVALDO", "VAU2050@GMAIL.COM", "3257-5588", "123456");
		return ResponseEntity.ok().body(u);
	}
	

	
	

}
