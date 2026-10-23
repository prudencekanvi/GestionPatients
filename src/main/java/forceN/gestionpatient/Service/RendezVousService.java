package forceN.gestionpatient.Service;

import forceN.gestionpatient.Model.RendezVous;
import forceN.gestionpatient.Repository.RendezVousRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.management.relation.RelationNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RendezVousService {

    private final RendezVousRepository rendezVousRepository;
// Méthode pour afficher tous les rendez-vous
    public List<RendezVous> getRendezVous() {
        return rendezVousRepository.findAll();
    }
// Méthode pour afficher un rendez-vous
    public RendezVous getRendezVousById(@PathVariable Long id) {
        return rendezVousRepository.findById(id).orElse(null);
    }
//Méthode pour créer un rendez-vous
    public RendezVous createRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }
//Méthode pour modifier un rendez-vous
    public RendezVous updateRendezVousById(Long id, @RequestBody RendezVous rendezVous) {
        RendezVous rendezVousExistant = rendezVousRepository.findById(id).orElseThrow(()-> new RuntimeException("RendezVous not found"));
        rendezVous.setId(rendezVousExistant.getId());
        return rendezVousRepository.save(rendezVous);
    }
  // Méthode pour supprimer un rendez-vous
    public void deleteRendezVousById(Long id) {
        rendezVousRepository.deleteById(id);
    }
}
