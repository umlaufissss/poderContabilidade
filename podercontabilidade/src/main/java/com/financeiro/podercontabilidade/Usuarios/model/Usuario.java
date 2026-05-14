package com.financeiro.podercontabilidade.Usuarios.model;

import com.financeiro.podercontabilidade.Usuarios.enummeration.TipoEmpresa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomePJ;
    private String nomeFantasia;
    private String cnpj;
    private String cpf;
    private TipoEmpresa tipo;

}
