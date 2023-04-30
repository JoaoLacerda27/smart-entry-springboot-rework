package com.smartentry.backend.enums.conversors;

import com.smartentry.backend.enums.ETipoCarro;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ETipoCarroConversor implements AttributeConverter<ETipoCarro, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ETipoCarro tipo){
        switch (tipo) {
            case VISITANTE:
                return 1;
            case EMPRESA:
                return 2;
            default:
                throw new IllegalArgumentException("Valor Inválido: " + tipo);
        }
    }

    @Override
    public ETipoCarro convertToEntityAttribute(Integer valor) {
        switch (valor) {
            case 1:
                return ETipoCarro.VISITANTE;
            case 2:
                return ETipoCarro.EMPRESA;
            default:
                throw new IllegalArgumentException("Valor Inválido: " + valor);
        }
    }
}
