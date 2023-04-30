package com.smartentry.backend.models;

import com.smartentry.backend.enums.ETipoFuncionario;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "tb_funcionario")
@SequenceGenerator(initialValue = 1, allocationSize = 1, name="seq_func_id_generator", sequenceName = "seq_func_id")
public class Funcionario implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_func_id_generator")
    private Long id;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private LocalDate data_admissao;
    @Column
    private LocalDate data_demissao;
    @Column
    private ETipoFuncionario tipo;
    @Column
    private String turno;



}
