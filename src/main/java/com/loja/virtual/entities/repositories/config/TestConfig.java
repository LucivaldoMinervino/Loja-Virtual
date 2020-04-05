package com.loja.virtual.entities.repositories.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.loja.virtual.entities.Usuario;
import com.loja.virtual.entities.repositories.UsuarioRepository;
import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired //injecao dependencia
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		Usuario u2 = new Usuario(null, "MARIA FERNDANDA", "MARIAFERNANDA@GMAIL", "3859-3225", "1234");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
