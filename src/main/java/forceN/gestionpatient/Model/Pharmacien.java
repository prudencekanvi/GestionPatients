package forceN.gestionpatient.Model;

import jakarta.persistence.OneToMany;

import java.util.*;

public class Pharmacien extends Utilisateur {

    @OneToMany(mappedBy = "pharmacien")
    private List<DemandeDisponibilite> demandeDisponibilites = new ArrayList<>();
}
