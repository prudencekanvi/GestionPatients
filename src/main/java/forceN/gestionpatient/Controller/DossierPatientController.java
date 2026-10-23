package forceN.gestionpatient.Controller;

import forceN.gestionpatient.Model.DossierPatient;
import forceN.gestionpatient.Service.DossierPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dossierpatients")
@RequiredArgsConstructor
public class DossierPatientController {
    private final DossierPatientService dossierPatientService;
  // Listes de tous les dossiers
    @GetMapping
    public List<DossierPatient> findAll() {
        return dossierPatientService.getAllDossierPatients();
    }
// Sélectionner un dossier patient
    @GetMapping("/{id}")
    public DossierPatient findById(@PathVariable Long id) {
    return dossierPatientService.getDossierPatientById(id);
    }
// créaction d'un dossier patient
    @PostMapping
    public DossierPatient save(@RequestBody DossierPatient dossierPatient) {
        return dossierPatientService.createDossierPatient(dossierPatient);
    }
// Mise  à jour d'un dossier patient
    @PutMapping("/{id}")
    public DossierPatient update(@PathVariable Long id, @RequestBody DossierPatient dossierPatient) {
    return dossierPatientService.UpdateDossierPatient(id,dossierPatient);
    }
//  Suppression  d'un dossier patient
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        dossierPatientService.deleteDossierPatientById(id);
    }


}
