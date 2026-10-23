package forceN.gestionpatient.Service;

import forceN.gestionpatient.Model.Patient;
import forceN.gestionpatient.Repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;
// methode pour afficher tous les patients
    public List<Patient> getAllPatients() {

        return patientRepository.findAll();

    }
//méthode pour afficher  un patient
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
    //méthode pour créer un patient
    public Patient CreatePatient(Patient patient) {
        return patientRepository.save(patient);
    }
// méthode pour modifier  un patient
    public Patient updatePatient(Long id,Patient patient) {

        Patient patientExistant = patientRepository.findById(id).orElseThrow( ()-> new RuntimeException("not found") );
        patient.setId(patientExistant.getId());

        return patientRepository.save(patient);
    }
// methode pour la suppression d'un patient
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }

}
