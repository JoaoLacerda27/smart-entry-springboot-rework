package com.smartentry.backend.enums.conversors;

import com.smartentry.backend.enums.ETipoFuncionario;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ETipoFuncionarioConversor implements AttributeConverter<ETipoFuncionario, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ETipoFuncionario tipo){
        switch (tipo) {
            case PORTEIRO:
                return 1;
            case ZELADOR:
                return 2;
            case GERENTE:
                return 3;
            case ADMIN:
                return 4;
            default:
                throw new IllegalArgumentException("Valor Inválido: " + tipo);
        }
    }

    @Override
    public ETipoFuncionario convertToEntityAttribute(Integer valor) {
        switch (valor) {
            case 1:
                return ETipoFuncionario.PORTEIRO;
            case 2:
                return ETipoFuncionario.ZELADOR;
            case 3:
                return ETipoFuncionario.GERENTE;
            case 4:
                return ETipoFuncionario.ADMIN;
            default:
                throw new IllegalArgumentException("Valor Inválido: " + valor);
        }
    }
}
