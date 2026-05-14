package com.financeiro.podercontabilidade.Usuarios.repository;

import com.financeiro.podercontabilidade.Usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositoryUser extends JpaRepository<Usuario, Long>
{
}
