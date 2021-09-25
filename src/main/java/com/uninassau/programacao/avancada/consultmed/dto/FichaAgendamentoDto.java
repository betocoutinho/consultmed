package com.uninassau.programacao.avancada.consultmed.dto;

import com.uninassau.programacao.avancada.consultmed.model.Medico;
import com.uninassau.programacao.avancada.consultmed.model.Paciente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FichaAgendamentoDto {

    private Long id;

    @Size(max = 70)
    @NotBlank
    private Paciente paciente;

    @Size(max = 70)
    @NotBlank
    private Medico medico;

    @Size(max = 60)
    @NotBlank
    private String especialidade;

    @Size(max = 150)
    @NotEmpty
    private String clinicaMedica;

    @Size(max = 15)
    @NotEmpty
    private String dataAgendamento;

    @Size(max = 15)
    @NotEmpty
    private String dataConsulta;

    @Size(max = 30)
    @NotEmpty
    private String statusConsulta;

}
