package forceN.gestionpatient.Controller;

import forceN.gestionpatient.Model.Consultation;
import forceN.gestionpatient.Repository.ConsultationRepository;
import forceN.gestionpatient.Service.ConsultationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultations")
@RequiredArgsConstructor
public class ConsultationController {

    private final ConsultationService consultationService;
    // Afficher toutes les consultations
    @GetMapping
    public List<Consultation> findAll() {
        return consultationService.getAllConsultations();
    }
    // Afficher une consultation
    @GetMapping("/{id}")
    public Consultation findById(@PathVariable Long id) {
        return consultationService.getConsultationById(id);
    }
    // Créer une consultation
    @PostMapping
    public Consultation save(@RequestBody Consultation consultation) {
        return consultationService.createConsultation(consultation);
    }
    // Modifier une consultation
    @PutMapping("/{id}")
    public Consultation update(@PathVariable Long id, @RequestBody Consultation consultation) {
        return  consultationService.updateConsultation(id, consultation);
    }
    // Supprimer une consultation
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        consultationService.deleteConsultationById(id);
    }

}
