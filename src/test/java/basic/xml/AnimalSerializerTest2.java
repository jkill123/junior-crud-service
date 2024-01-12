package basic.xml;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.File;
import java.io.IOException;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AnimalSerializerTest2 {

    @InjectMocks
    private AnimalSerializer testInstance;

    @Mock
    private ObjectMapper objectMapper;

    @Mock
    private Animal animal;

    @Mock
    private File animalData;

    @Before
    public void init() throws IOException {
        doNothing().when(objectMapper).writeValue(animalData, animal);
    }

    @Test
    public void shouldSerialize() throws IOException {
        testInstance.serialize(animal, animalData);

        verify(objectMapper).writeValue(animalData, animal);
    }

//    @Test
//    public void shouldSerializeJson() throws IOException {
//        animalData = new File(PATH + FILE_NAME_JSON);
//
//        jsonSerialize.serialize(animal, animalData);
//
//        Assert.assertTrue(animalData.exists());
//        Assert.assertEquals(animalData.getPath(), PATH + FILE_NAME_JSON);
//    }
//
//    @Test
//    public void shouldSerializeYAML() throws IOException {
//        animalData = new File(PATH + FILE_NAME_YAML);
//
//        yamlSerialize.serialize(animal, animalData);
//
//        Assert.assertTrue(animalData.exists());
//        Assert.assertEquals(animalData.getPath(), PATH + FILE_NAME_YAML);
//    }
//
//    @Test
//    public void deserializer() throws IOException {
//        this.xmlSerialize.serialize(animal, animalData);
//
//        Animal deserialize = this.xmlSerialize.deserialize(animalData);
//
//        Assert.assertEquals(animal, deserialize);
//    }
//
//    @Test
//    public void deserializeList() throws IOException {
//        List<Animal> animals = List.of(
//                animal,
//                Animal.builder()
//                        .age(1)
//                        .color("red")
//                        .name("Adolf")
//                        .gender(false)
//                        .type("German Shepherd")
//                        .build()
//        );
//
//        String fileName = "animals.xml";
//        new XmlMapper()
//                .writeValue(new File(PATH + fileName), animals);
//
//        List<Animal> animals1 = this.xmlSerialize.deserializeList(new File(PATH + fileName));
//
//        Assert.assertEquals(animals, animals1);
//        new File(PATH + fileName).delete();
//    }
}
