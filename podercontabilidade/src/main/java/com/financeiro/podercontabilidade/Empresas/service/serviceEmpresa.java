package com.financeiro.podercontabilidade.Empresas.service;

import com.financeiro.podercontabilidade.Empresas.model.Empresa;
import com.financeiro.podercontabilidade.Empresas.repository.repositoryEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class serviceEmpresa
{
    private final repositoryEmpresa repository;

    public List<Empresa> listar()
    {
        return repository.findAll();
    }

    public Empresa buscarPorID(Long id)
    {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa não encontrada!"));
    }

    public Empresa criarEmpresa (Empresa empresa)
    {
        return repository.save(empresa);
    }

    public Empresa atualizar (Empresa dados, Long id)
    {
        Empresa empresa = buscarPorID(id);

        empresa.setNomeFantasia(dados.getNomeFantasia());
        empresa.setEndereco(dados.getEndereco());
        empresa.setTipo(dados.getTipo());

        return repository.save(empresa);
    }

    public void deletar(Long id)
    {
        repository.deleteById(id);
    }
}
