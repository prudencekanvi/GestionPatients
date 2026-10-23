package forceN.gestionpatient.Controller;

import forceN.gestionpatient.Model.Patient;
import forceN.gestionpatient.Service.PatientService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
public class PatientController {
    private  final PatientService patientService;
// Afficher la liste des patients
    @Operation(summary = "find all patients")
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }
 // selectionner un patient
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }
    // ajouter un patient
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.CreatePatient(patient);

    }

    //Mise à jour d'un patient
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }
// suppression d'un patient
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
       patientService.deletePatientById(id);

    }
}
