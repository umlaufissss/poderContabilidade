package com.financeiro.podercontabilidade.Empresas.repository;

import com.financeiro.podercontabilidade.Empresas.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositoryEmpresa extends JpaRepository<Empresa, Long>
{

}
