package basic.composition;

import lombok.Getter;

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
