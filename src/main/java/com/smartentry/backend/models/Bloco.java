package com.smartentry.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_bloco")
@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "seq_bloco_id_generator", sequenceName = "seq_bloco_id")
public class Bloco implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_bloco_id_generator")
    private Long id;
    @Column(nullable = false)
    private String nome;

}
