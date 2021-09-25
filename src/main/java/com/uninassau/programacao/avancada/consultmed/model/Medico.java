package com.uninassau.programacao.avancada.consultmed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medico extends Pessoa{
    private String crm;
    @OneToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.REMOVE} )
    private EspecialidadeMedica especialidadeMedica;
}
