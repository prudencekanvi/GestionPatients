package forceN.gestionpatient.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient extends Utilisateur {
    private Date dateNaissance;
    private String adresse;
    private String telephone;
    private String sexe;

}
