package forceN.gestionpatient.Service;

import forceN.gestionpatient.Model.Consultation;
import forceN.gestionpatient.Repository.ConsultationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultationService {
    private final ConsultationRepository consultationRepository;
   // Méthode pour  afficher toutes les consultations
    public List<Consultation> getAllConsultations() {

        return consultationRepository.findAll();
    }
    //Méthode pour afficher une consultation
    public Consultation getConsultationById(Long id) {
        return consultationRepository.findById(id).orElse(null);
    }
    // Méthode pour créer une consultation
    public Consultation createConsultation(@RequestBody Consultation consultation) {
        return consultationRepository.save(consultation);
    }
    // Méthode pour modifier une consultation
    public Consultation updateConsultation(Long id,@RequestBody Consultation consultation) {
        Consultation consultationExistant = consultationRepository.findById(id).orElseThrow(()-> new RuntimeException("consultation not found"));
        consultation.setId(consultationExistant.getId());
        return consultationRepository.save(consultation);
    }

    // Méthode pour supprimer une consultation
    public void deleteConsultationById(Long id) {
        consultationRepository.deleteById(id);
    }
}
