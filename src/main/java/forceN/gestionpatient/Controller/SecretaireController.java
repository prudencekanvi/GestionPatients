package forceN.gestionpatient.Controller;

import forceN.gestionpatient.Model.Secretaire;
import forceN.gestionpatient.Service.SecretaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secretaire")
@RequiredArgsConstructor
public class SecretaireController {

    private final SecretaireService secretaireService;
// Afficher les secretaires
    @GetMapping
    public List<Secretaire> findAll() {
        return secretaireService.findAll();
    }
// afficher un secretaire
    @GetMapping("/{id}")
    public Secretaire findById(@PathVariable Long id) {
        return secretaireService.findById(id);
    }
// Enregistrer un secretaire
    @PostMapping
    public Secretaire save(@RequestBody Secretaire secretaire) {
        return secretaireService.save(secretaire);
    }
// Modifier un secretaire
    @PutMapping("/{id}")
    public Secretaire update(@RequestBody Secretaire secretaire, @PathVariable Long id) {
        return secretaireService.update(id, secretaire);
    }
//suppimer un secretaire
    @DeleteMapping("/{id}")
    public void deleteSecretaire(@PathVariable Long id) {
        secretaireService.deleteSecretaire(id);
    }
}
