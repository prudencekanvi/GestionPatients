package forceN.gestionpatient.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
    long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String role;





}
