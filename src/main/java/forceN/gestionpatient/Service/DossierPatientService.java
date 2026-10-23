package forceN.gestionpatient.Service;

import forceN.gestionpatient.Model.DossierPatient;
import forceN.gestionpatient.Repository.DossierPatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DossierPatientService {
    private final DossierPatientRepository dossierPatientRepository;
    //Méthode pour recupérer tous les dossiers
    public List<DossierPatient> getAllDossierPatients() {
        return dossierPatientRepository.findAll();
    }

    // Méthode pour recupérer un dossier patient
    public DossierPatient getDossierPatientById(Long id) {
        return dossierPatientRepository.findById(id).orElse(null);
    }
    // méthode pour créer un dossier patient
    public DossierPatient createDossierPatient(DossierPatient dossierPatient) {
        return dossierPatientRepository.save(dossierPatient);
    }
    // Méthode pour mettre à jour un dossier patient
    public DossierPatient UpdateDossierPatient(Long id, DossierPatient dossierPatient) {
        DossierPatient dossierPatientExistant = dossierPatientRepository.findById(id).orElseThrow(()-> new RuntimeException("DossierPatient not found"));
        dossierPatient.setId(dossierPatientExistant.getId());
        return dossierPatientRepository.save(dossierPatient);
    }
    // Méthode pour supprimer un dossier patient
    public void deleteDossierPatientById(Long id) {
        dossierPatientRepository.deleteById(id);
    }
}
