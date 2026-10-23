package forceN.gestionpatient.Controller;

import forceN.gestionpatient.Model.RendezVous;
import forceN.gestionpatient.Service.RendezVousService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rendezVous")
@RequiredArgsConstructor
public class RendezVousController {

    private final RendezVousService rendezVousService;
// Afficher les rendez-vous
    @GetMapping
    public List<RendezVous> getRendezVous() {
        return rendezVousService.getRendezVous();
    }
// Afficher un rendez-vous
    @GetMapping("/{id}")
    public RendezVous getRendezVous(@PathVariable Long id) {
        return rendezVousService.getRendezVousById(id);
    }
// Créer unrendez-vous
    @PostMapping
    public RendezVous save(@RequestBody RendezVous rendezVous) {
        return rendezVousService.createRendezVous(rendezVous);
    }
//Modifier un rendez-vous
    @PutMapping("/{id}")
    public RendezVous updateById(Long id, @RequestBody RendezVous rendezVous) {
        return rendezVousService.updateRendezVousById(id, rendezVous);
    }
// Supprimer un rendez-vous
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        rendezVousService.deleteRendezVousById(id);
    }
}
