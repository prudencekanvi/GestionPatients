package forceN.gestionpatient.Repository;

import forceN.gestionpatient.Model.DossierPatient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierPatientRepository extends JpaRepository<DossierPatient, Long> {
}
