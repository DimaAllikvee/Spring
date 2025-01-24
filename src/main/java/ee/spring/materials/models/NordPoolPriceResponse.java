package ee.spring.materials.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class NordPoolPriceResponse {

    public boolean success;

    private Data data;
}
