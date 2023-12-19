package composition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAggr {

    //todo aggregation
    private int age;
    private String name;
    private Address address;
}
