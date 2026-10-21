package forceN.gestionpatient.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient extends Utilisateur{


    private Date dateNaissance;
    private String adresse;
    private String telephone;
    private String sexe;

    @OneToOne(mappedBy = "patient")
    private DossierPatient dossierPatient;

    @OneToMany(mappedBy = "patient")
    private List<DemandeDisponibilite> demandeDisponibilite = new ArrayList<>();

}
