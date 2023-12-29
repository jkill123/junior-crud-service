package basic.streams;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Human {
    private String name;
    private List<String> pets;
}
