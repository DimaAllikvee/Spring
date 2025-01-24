package ee.spring.materials.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Data {

    public ArrayList<NordPoolPrice> ee;

    public ArrayList<NordPoolPrice> lv;

    public ArrayList<NordPoolPrice> lt;

    public ArrayList<NordPoolPrice> fi;
}
