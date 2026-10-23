package forceN.gestionpatient.Controller;

import forceN.gestionpatient.Model.Administrateur;
import forceN.gestionpatient.Repository.AdministrateurRepository;
import forceN.gestionpatient.Service.AdministrateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/administrateurs")
@RequiredArgsConstructor
public class AdministrateurController {

    private final AdministrateurService administrateurService;
// Afficher les administrateur
    @GetMapping
    public List<Administrateur> findAll() {
        return administrateurService.findAll();
    }
// Afficher un administrateur
    @GetMapping("/{id}")
    public Administrateur findOne(@PathVariable Long id) {
     return administrateurService.getOneAdministrateur(id);
    }
// Enrégistrer un administrateur
    @PostMapping
    public Administrateur save(@RequestBody Administrateur administrateur) {
        return  administrateurService.saveAdministrateur(administrateur);
    }
// Modifier un administrateur
    @PutMapping("/{id}")
    public Administrateur update(@PathVariable Long id, @RequestBody Administrateur administrateur) {
        return administrateurService.saveAdministrateur(administrateur);
    }
// Supprimer un administrateur
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        administrateurService.deleteAdministrateur(id);
    }

}
