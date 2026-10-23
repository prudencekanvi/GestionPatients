package forceN.gestionpatient.Service;

import forceN.gestionpatient.Model.Administrateur;
import forceN.gestionpatient.Repository.AdministrateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdministrateurService {

    private final AdministrateurRepository administrateurRepository;
// Méthode pour afficher tous les administrateurs
    public List<Administrateur> findAll() {
        return administrateurRepository.findAll();
    }
// Méthode pour afficher un administrateur
    public Administrateur getOneAdministrateur(Long id) {
        return administrateurRepository.findById(id).orElse(null);
    }
// Méthode pour enreégistrer un administrateur
    public Administrateur saveAdministrateur(Administrateur administrateur) {
        return administrateurRepository.save(administrateur);
    }
// Méthode pour modifier un administrateur
    public Administrateur updateAdministrateur(Long id, Administrateur administrateur) {
        Administrateur administrateurExistant = administrateurRepository.findById(id).orElseThrow(()-> new RuntimeException("Administrateur n'existe pas"));
        administrateur.setId(administrateurExistant.getId());
        return administrateurRepository.save(administrateur);
    }
   // Méthode pour supprimer un administrateur
    public void deleteAdministrateur(Long id) {
        administrateurRepository.deleteById(id);
    }
}
