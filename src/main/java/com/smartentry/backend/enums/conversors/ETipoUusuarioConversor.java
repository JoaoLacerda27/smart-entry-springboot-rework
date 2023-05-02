package com.smartentry.backend.enums.conversors;

import com.smartentry.backend.enums.ETipoFuncionario;
import com.smartentry.backend.enums.ETipoUsuario;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ETipoUusuarioConversor implements AttributeConverter<ETipoUsuario, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ETipoUsuario tipo){
        switch (tipo) {
            case MORADOR:
                return 1;
            case PORTEIRO:
                return 2;
            case ADMIN:
                return 3;
            default:
                throw new IllegalArgumentException("Valor Inválido: " + tipo);
        }
    }

    @Override
    public ETipoUsuario convertToEntityAttribute(Integer valor) {
        switch (valor) {
            case 1:
                return ETipoUsuario.MORADOR;
            case 2:
                return ETipoUsuario.PORTEIRO;
            case 3:
                return ETipoUsuario.ADMIN;
            default:
                throw new IllegalArgumentException("Valor Inválido: " + valor);
        }
    }

}
