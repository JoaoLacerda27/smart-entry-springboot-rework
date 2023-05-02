package com.smartentry.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Data
@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "seq_morador_id_generator", sequenceName = "seq_morador_id")
@Table(name = "tb_morador")
public class Morador implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_morador_id_generator")
    private Long id;
    @Column(length = 200, nullable = false)
    private String nome;
    @Column(nullable = false)
    private int cpf;
    @Column
    private int rg;
    @Column
    private LocalDate data_nascimento;
    @Column(length = 100, nullable = false)
    private String telefone_1;
    @Column
    private String telefone_2;
    @Column
    private String email;
    @Column
    private boolean status;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_MORADOR__ID_APTO"))
    private Apto apto;
}
