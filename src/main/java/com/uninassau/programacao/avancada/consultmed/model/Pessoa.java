package com.uninassau.programacao.avancada.consultmed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pessoa {
    @Id
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Long Id;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    @OneToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.REMOVE} )
    private Endereco endereco;
    private String telefone;

}
