package forceN.gestionpatient.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DossierPatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCreaction;

    @ManyToOne
    @JoinColumn(name = "secretaire_id")
    private Secretaire secretaire;

    @OneToMany(mappedBy = "dossierPatient")
    private List<Consultation> consultations = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

}
