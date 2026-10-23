package forceN.gestionpatient.Service;

import forceN.gestionpatient.Model.Secretaire;
import forceN.gestionpatient.Repository.SecretaireRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SecretaireService {

    private final SecretaireRepository secretaireRepository;
// Methode pour afficher les secrétaire
    public List<Secretaire> findAll() {
        return secretaireRepository.findAll();
    }
// Méthode pour afficher un secretaire
    public Secretaire findById(Long id) {
        return secretaireRepository.findById(id).orElse(null);
    }
//Méthode pour enrégisstrer un secretaire
    public Secretaire save(Secretaire secretaire) {
        return secretaireRepository.save(secretaire);
    }
//Méthode pour modifier un secretaire
    public Secretaire update(Long id,Secretaire secretaire) {
        Secretaire secretaireExistant = secretaireRepository.findById(id).orElseThrow(()-> new RuntimeException("Secretaire existant"));
        secretaire.setId(secretaireExistant.getId());
        return secretaireRepository.save(secretaire);
    }
// Methode pour supprimer un secretaire
    public void deleteSecretaire(Long id) {
        secretaireRepository.deleteById(id);
    }
}
