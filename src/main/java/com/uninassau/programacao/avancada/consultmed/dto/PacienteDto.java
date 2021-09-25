package com.uninassau.programacao.avancada.consultmed.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PacienteDto extends PessoaDTO{
    private String NomeDaMãe;
}
