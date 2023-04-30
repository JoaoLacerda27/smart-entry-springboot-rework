package com.smartentry.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@ToString
@Table(name = "tb_carro")
@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "seq_car_id_generator", sequenceName = "seq_car_id")
public class Carro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_car_id_generator")
    @Column
    private Long id;
    @Column(length = 200)
    private String modelo;
    @Column
    private int ano;
    @Column(length = 100, nullable = false)
    private String placa;
    @Column
    private Instant data_criacao;
    @Column
    private boolean status;

}
