package forceN.gestionpatient.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.*;
@Entity
public class Pharmacien extends Utilisateur {

    @OneToMany(mappedBy = "pharmacien")
    private List<DemandeDisponibilite> demandeDisponibilites = new ArrayList<>();
}
