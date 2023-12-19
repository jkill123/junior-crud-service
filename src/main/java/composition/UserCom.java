package composition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class UserCom {

    //todo composition
    private int age;
    private String name;
    private Address address;

    public UserCom(int age, String name, String street) {
        this.age = age;
        this.name = name;
        this.address = new Address(street);
    }
}
