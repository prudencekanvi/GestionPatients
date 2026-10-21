package forceN.gestionpatient.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Secretaire extends Utilisateur {

    @OneToMany(mappedBy = "secretaire")
    private List<RendezVous> rendezVous =new ArrayList<RendezVous>();

    @OneToMany(mappedBy = "secretaire")
    private List<DossierPatient>  dossierPatients =new ArrayList<>();



}