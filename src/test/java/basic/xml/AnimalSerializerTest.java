package basic.xml;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AnimalSerializerTest {

    private static final String FILE_NAME_XML = "chip.xml";
    private static final String FILE_NAME_JSON = "chip.json";
    private static final String FILE_NAME_YAML = "chip.yaml";
    private static final String PATH = "src/main/resources/";

    private final AnimalSerializer xmlSerialize = new AnimalSerializer(new XmlMapper());
    private final AnimalSerializer jsonSerialize = new AnimalSerializer(new JsonMapper());
    private final AnimalSerializer yamlSerialize = new AnimalSerializer(new YAMLMapper());

    private Animal animal;
    private File animalData;

    @Before
    public void init() {
        animal = Animal.builder()
                .age(2)
                .color("black")
                .name("Chip")
                .gender(true)
                .type("Labrador")
                .build();
    }

    @After
    public void clean() {
        if (animalData != null) {
            animalData.delete();
        }
    }

    @Test
    public void shouldSerializeXML() throws IOException {
        animalData = new File(PATH + FILE_NAME_XML);

        xmlSerialize.serialize(animal, animalData);

        Assert.assertTrue(animalData.exists());
    }

    @Test
    public void shouldSerializeJson() throws IOException {
        animalData = new File(PATH + FILE_NAME_JSON);

        jsonSerialize.serialize(animal, animalData);

        Assert.assertTrue(animalData.exists());
    }

    @Test
    public void shouldSerializeYAML() throws IOException {
        animalData = new File(PATH + FILE_NAME_YAML);

        yamlSerialize.serialize(animal, animalData);

        Assert.assertTrue(animalData.exists());
    }

    @Test
    public void deserializer() throws IOException {
        animalData = new File(PATH + FILE_NAME_XML);
        xmlSerialize.serialize(animal, animalData);

        Animal actual = this.xmlSerialize.deserialize(animalData);

        Assert.assertEquals(animal, actual);
    }

    @Test
    public void deserializeList() throws IOException {
        List<Animal> animals = List.of(
                animal,
                Animal.builder()
                        .age(1)
                        .color("red")
                        .name("Adolf")
                        .gender(false)
                        .type("German Shepherd")
                        .build()
        );

        String fileName = "animals.xml";
        new XmlMapper()
                .writeValue(new File(PATH + fileName), animals);

        List<Animal> actual = this.xmlSerialize.deserializeList(new File(PATH + fileName));

        Assert.assertEquals(animals, actual);
        new File(PATH + fileName).delete();
    }
}
