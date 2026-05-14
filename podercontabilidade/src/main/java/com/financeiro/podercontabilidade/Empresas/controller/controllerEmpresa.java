package com.financeiro.podercontabilidade.Empresas.controller;

import com.financeiro.podercontabilidade.Empresas.model.Empresa;
import com.financeiro.podercontabilidade.Empresas.service.serviceEmpresa;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
@RequiredArgsConstructor

public class controllerEmpresa
{
    private final serviceEmpresa service;

    @GetMapping
    public List<Empresa> listar()
    {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> buscarPorId(@PathVariable Long id)
    {
        return ResponseEntity.ok(service.buscarPorID(id));
    }

    @PostMapping
    public ResponseEntity<Empresa> criarEmpresa (@RequestBody Empresa empresa)
    {
        return ResponseEntity.ok(service.criarEmpresa(empresa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empresa> atualizar (@RequestBody Empresa empresa, @PathVariable Long id)
    {
        return ResponseEntity.ok(service.atualizar(empresa, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id)
    {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
