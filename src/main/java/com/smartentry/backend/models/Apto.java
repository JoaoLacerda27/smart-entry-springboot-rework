package com.smartentry.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Data
@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "seq_apto_id_generator", sequenceName = "seq_apto_id")
@Table(name = "tb_apto")
public class Apto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_apto_id_generator")
    @Column
    private Long id;
    @Column
    private int numero;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_APTO__ID_BLOCO"))
    private Bloco id_bloco;

}
