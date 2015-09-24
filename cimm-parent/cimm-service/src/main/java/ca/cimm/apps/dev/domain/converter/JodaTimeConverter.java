package ca.cimm.apps.dev.domain.converter;

import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.joda.time.DateTime;

@Converter
public class JodaTimeConverter implements AttributeConverter<DateTime, Date>{

	@Override
	public Date convertToDatabaseColumn(DateTime attribute) {
		return attribute.toGregorianCalendar().getTime();
	}

	@Override
	public DateTime convertToEntityAttribute(Date dbData) {
		return new DateTime(dbData);
	}

}
