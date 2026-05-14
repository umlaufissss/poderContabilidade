package com.financeiro.podercontabilidade.Usuarios.controller;

import com.financeiro.podercontabilidade.Usuarios.model.Usuario;
import com.financeiro.podercontabilidade.Usuarios.service.serviceUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class controllerUsuario
{
    private final serviceUsuario service;

    @GetMapping
    public List<Usuario> listar()
    {
        return service.listar();
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id)
    {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario)
    {
        return ResponseEntity.ok(service.criarUsuario(usuario));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario, @PathVariable Long id)
    {
        return ResponseEntity.ok(service.atualizar(usuario, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id)
    {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
