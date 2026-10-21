package forceN.gestionpatient.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Planning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @OneToOne(mappedBy = "planning")
    private Medecin medecin;

    @OneToMany(mappedBy = "planning")
    private List<Creneau> creneux =new ArrayList<>();
}
