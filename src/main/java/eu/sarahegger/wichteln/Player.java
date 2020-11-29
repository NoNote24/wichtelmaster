package eu.sarahegger.wichteln;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name;
    private String email;

    @Override
    public String toString() {
        return name;
    }

}
