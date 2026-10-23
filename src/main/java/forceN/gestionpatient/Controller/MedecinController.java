package forceN.gestionpatient.Controller;

import forceN.gestionpatient.Model.Medecin;
import forceN.gestionpatient.Service.MedecinService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medecins")
@RequiredArgsConstructor
public class MedecinController {

    private final MedecinService medecinService;
    //Afficher la liste des medecins
    @Operation(summary = "find all medecin")
    @GetMapping
    public List<Medecin> getAllMedecin() {
        return medecinService.getAllMedecin();
    }
//selectionner un medecin
    @GetMapping("/{id}")
    public Medecin getMedecinById(@PathVariable Long id) {
        return medecinService.getMedecinById(id);
    }
//créer un médecin
    @PostMapping
    public Medecin createMedecin(@RequestBody Medecin medecin) {
        return  medecinService.createMedecin(medecin);
    }
//Mise à jour d'un medécin
    @PutMapping("/{id}")
    public Medecin updateMedecinById(Long id, @RequestBody Medecin medecin) {
        return medecinService.updateMedecinById(id, medecin);
    }
//suppression d'un medécin
    @DeleteMapping("/{id}")
    public void deleteMedecinById(@PathVariable Long id) {
        medecinService.deleteMedecinById(id);
    }


}
