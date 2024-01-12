package basic.xml;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AnimalSerializer {

    private final ObjectMapper mapper;

    public AnimalSerializer(ObjectMapper objectMapper) {
        this.mapper = objectMapper;
    }

    public void serialize(Animal animal, File file) throws IOException {
        this.mapper.writeValue(file, animal);
    }

    public Animal deserialize(File file) throws IOException {
        return this.mapper.readValue(file, Animal.class);
    }

    public List<Animal> deserializeList(File file) throws IOException {
        return this.mapper.readValue(file, new TypeReference<>() {
        });
    }
}