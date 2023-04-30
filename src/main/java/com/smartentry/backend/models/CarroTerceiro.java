package com.smartentry.backend.models;

import com.smartentry.backend.enums.ETipoCarro;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
@Entity
@Table(name = "tb_carro_terceiro")
@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "seq_car_terceiro_id_generator", sequenceName = "seq_car_terceiro_id")
public class CarroTerceiro implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_car_terceiro_id_generator")
    private Long id;
    @Column(length = 100, nullable = false)
    private String placa;
    @Column
    private Instant data_criacao;
    @Column
    private ETipoCarro tipo;
}
