package com.financeiro.podercontabilidade.Usuarios.service;

import com.financeiro.podercontabilidade.Usuarios.model.Usuario;
import com.financeiro.podercontabilidade.Usuarios.repository.repositoryUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class serviceUsuario
{
    private final repositoryUser repository;

    public List<Usuario> listar()
    {
        return repository.findAll();
    }

    public Usuario buscarPorId(Long id)
    {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public Usuario criarUsuario(Usuario usuario)
    {
        return repository.save(usuario);
    }

    public Usuario atualizar(Usuario dados, Long id)
    {
        Usuario usuario = buscarPorId(id);

        usuario.setNomePJ(dados.getNomePJ());
        usuario.setNomeFantasia(dados.getNomeFantasia());
        usuario.setCnpj(dados.getCnpj());
        usuario.setCpf(dados.getCpf());
        usuario.setTipo(dados.getTipo());

        return repository.save(usuario);
    }

    public void deletar (Long id)
    {
        repository.deleteById(id);
    }
}
