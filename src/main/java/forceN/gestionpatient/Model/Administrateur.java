package forceN.gestionpatient.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Entity
public class Administrateur extends Utilisateur {

    @OneToMany(mappedBy = "administrateur")
    private List<Rapport> rapport = new ArrayList<>();
}
