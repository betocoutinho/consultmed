package com.uninassau.programacao.avancada.consultmed.dto;

import com.uninassau.programacao.avancada.consultmed.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PacienteDto{
    private Long Id;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private Endereco endereco;
    private String telefone;
    private String NomeDaMãe;
}
