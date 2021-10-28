package com.projeto.cliente.model.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.projeto.cliente.enumeration.TipoTelefone;

@Converter
public class TipoTelefoneConverter implements AttributeConverter<TipoTelefone, String>{
	
	private static final TipoTelefoneConverter INSTANCE = new TipoTelefoneConverter();
	
	public static final TipoTelefoneConverter getInstance() {
		return INSTANCE;
	}
	
	@Override
	public String convertToDatabaseColumn(final TipoTelefone value) {
		if (value == null) {
			return null;
		} else {
			return value.getSigla();
		}
	}
	
	@Override
	public TipoTelefone convertToEntityAttribute(final String value) {
		return TipoTelefone.getBySigla(value);
	}

}
