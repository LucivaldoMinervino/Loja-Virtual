package com.loja.virtual.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.virtual.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	// depois da criação usuario repository criar conf. perfil teste
}
