package ee.spring.materials.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Author {

    @Id
    private String idCode;

    private String firstName;

    private String lastName;

    @OneToOne
    private Contact contact;
}
