package forceN.gestionpatient.Repository;

import forceN.gestionpatient.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
