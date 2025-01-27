package ee.spring.materials.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;

    private String name;

    private String surname;

    private int age;

    private String email;

    private String password;


    }
