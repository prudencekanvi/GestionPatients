package forceN.gestionpatient.Service;

import forceN.gestionpatient.Model.Medecin;
import forceN.gestionpatient.Repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MedecinService {

    private MedecinRepository medecinRepository;
  //methode pour recupérer tous les medecins
    public List<Medecin> getAllMedecin() {
        return  medecinRepository.findAll();
    }
//methode pour selectionner un medecin
    public Medecin getMedecinById(Long id) {
        return medecinRepository.findById(id).orElse(null);
    }
// Methode pour créer un medécin
    public Medecin createMedecin(@RequestBody Medecin medecin) {
        return medecinRepository.save(medecin);
    }
// méthode pour mettre à jour un médecin
   public Medecin updateMedecinById(Long id, Medecin medecin) {
        Medecin MedecinToUpdate = medecinRepository.findById(id).orElseThrow(()->new RuntimeException("Medecin Not Found"));
        medecin.setId(MedecinToUpdate.getId());
        return medecinRepository.save(medecin);
   }
// méthode pour la suppresion d'un medecin
    public void deleteMedecinById(Long id) {
        medecinRepository.deleteById(id);
    }
}
