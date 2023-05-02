package com.smartentry.backend.enums.conversors;

import com.smartentry.backend.enums.ETipoSistema;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ETipoSistemaConversor implements AttributeConverter<ETipoSistema, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ETipoSistema tipo){
        switch (tipo) {
            case MOBILE:
                return 1;
            case WEB:
                return 2;
            default:
                throw new IllegalArgumentException("Valor Inválido: " + tipo);
        }
    }

    @Override
    public ETipoSistema convertToEntityAttribute(Integer valor) {
        switch (valor) {
            case 1:
                return ETipoSistema.MOBILE;
            case 2:
                return ETipoSistema.WEB;
            default:
                throw new IllegalArgumentException("Valor Inválido: " + valor);
        }
    }

}
