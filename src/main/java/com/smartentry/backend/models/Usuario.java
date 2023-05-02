package com.smartentry.backend.models;

import com.smartentry.backend.enums.ETipoSistema;
import com.smartentry.backend.enums.ETipoUsuario;
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
@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "seq_usuario_id_generator", sequenceName = "seq_usuario_id")
@Table(name = "tb_usuario")
public class Usuario implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_usuario_id_generator")
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome_usuario;
    @Column(length = 100, nullable = false)
    private String senha;
    @Column
    private boolean status;
    @Column
    private ETipoSistema tipo_sistema;
    @Column
    private ETipoUsuario tipo_usuario;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_USUARIO__ID_MORADOR"))
    private Morador morador;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_USUARIO__ID_FUNCIONARIO"))
    private Funcionario funcionario;
}
