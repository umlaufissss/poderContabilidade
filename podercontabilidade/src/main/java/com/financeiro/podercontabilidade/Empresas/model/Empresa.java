package com.financeiro.podercontabilidade.Empresas.model;

import com.financeiro.podercontabilidade.Empresas.enummeration.TipoEmpresa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="empresas")
@AllArgsConstructor
@NoArgsConstructor

public class Empresa
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeFantasia;
    private String endereco;
    private TipoEmpresa tipo;
}
