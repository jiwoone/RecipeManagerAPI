package ca.briangroup.recipemanger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
public class Recipe extends AuditModel {

    @Id
    @SequenceGenerator(
            name = "recipe_sequence",
            sequenceName = "recipe_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "recipe_sequence"
    )
    private Long id;

    @NotNull
    @Size(max = 100)
    private String name;

    @Size(max = 250)
    private String description;

    @NotNull
    @Size(max = 100)
    private String category;

    @Override
    public String toString() {
        return "Recipe{" +
                "id =" + id +
                "name =" + name +
                "category =" + category +
                "description" + description +
                "}";
    }

}
