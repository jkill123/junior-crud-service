package basic.xml;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AnimalSerializerXml {

    private final XmlMapper mapper;

    public AnimalSerializerXml() {
        this.mapper = new XmlMapper();
    }

    public void serialize(Animal animal, File file) throws IOException {
        this.mapper.writeValue(file, animal);

    }

    public Animal deserialize(File file) throws IOException {
        return this.mapper.readValue(file, Animal.class);
    }

    public List<Animal> deserializeList(File file) throws IOException {
     return this.mapper.readValue(file, new TypeReference<List<Animal>>(){});
    }
}