package com.uninassau.programacao.avancada.consultmed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FichaAgendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Paciente paciente;

    @Column(nullable = false)
    private Medico medico;

    @Column(nullable = false)
    private String especialidade;

    @Column(nullable = false)
    private String clinicaMedica;

    @Column(nullable = false)
    private String dataAgendamento;

    @Column(nullable = false)
    private String dataConsulta;

    @Column(nullable = false)
    private StatusDoAgendamento statusConsulta;


}
