package com.uninassau.programacao.avancada.consultmed.dto;

import com.uninassau.programacao.avancada.consultmed.model.EspecialidadeMedica;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class MedicoDto extends PessoaDTO{
    private String crm;
    private EspecialidadeMedica especialidadeMedica;
}
