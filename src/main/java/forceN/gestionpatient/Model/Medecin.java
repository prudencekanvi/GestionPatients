package forceN.gestionpatient.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medecin extends Utilisateur {



    private String specialite;

    @OneToOne
    @JoinColumn(name = "planning_id", unique = true)
    private Planning planning;

    @OneToMany(mappedBy = "medecin")
    private List<Consultation> consultation =new ArrayList<>();

    @OneToMany(mappedBy = "medecin")
    private List<RendezVous> rendezVous =new ArrayList<>();

}
