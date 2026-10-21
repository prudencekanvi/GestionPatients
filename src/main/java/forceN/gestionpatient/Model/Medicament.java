package forceN.gestionpatient.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medicament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String nom;
    private String dosage;
    private int stock;

    @ManyToMany(mappedBy = "medicament")
    private Set<Ordonnance> ordonnances = new HashSet<>();

    @OneToMany(mappedBy = "medicament")
    private List<DemandeDisponibilite> demandeDisponibilite = new ArrayList<>();
}
