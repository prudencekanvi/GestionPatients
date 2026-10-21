package forceN.gestionpatient.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ordonnance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private Date dateEmission;

    @OneToOne
    @JoinColumn(name = "consultation_id")
    private Consultation consultation;

    @ManyToMany
            @JoinTable(name = "ordonnance_medicament",
                    joinColumns = @JoinColumn(name = "ordonnance_id"),
                    inverseJoinColumns = @JoinColumn(name = "medicament_id")
            )
 private Set<Medicament> medicament = new HashSet<>();


}
