package converter;

import java.util.List;

import javax.persistence.AttributeConverter;

import com.example.famto.entity.AddressModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddressConvertorClass implements AttributeConverter<List<AddressModel>, String> {
	
	private static ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();

	}

	@Override
	public String convertToDatabaseColumn(List<AddressModel> attribute) {
		try {
			return mapper.writeValueAsString(attribute);
		} catch (JsonProcessingException e) {
			return null;
		}
	}

	@Override
	public List<AddressModel> convertToEntityAttribute(String dbData) {
		try {
			return mapper.readValue(dbData,new TypeReference<List<AddressModel>>() {});
		} catch (Exception e) {
			return null;
		}
	}
	
}